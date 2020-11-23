import java.io.*;

public class TextCopy {
	public static void main(String [] args)
	{
		File src = new File("c:\\windows\\system.ini");
		File dst = new File("c:\\Users\\dkstj\\system.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		
		try {
			fw = new FileWriter(dst);
			fr = new FileReader(src);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			
			while((c=in.read())!=-1)
			{
				out.write((char)c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
		
	}
}
