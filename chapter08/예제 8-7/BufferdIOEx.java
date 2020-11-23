import java.io.*;
public class BufferdIOEx {
	public static void main(String [] args)
	{
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 51);
		InputStreamReader in = new InputStreamReader(System.in);
		System.out.println();
		int c;
		
		try {
			while((c = in.read())!= -1)
			{
				bout.write((char)c);
			}
			bout.flush();
			
			if(in != null)
			{
				in.close();
				bout.close();
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
		
	}
}
