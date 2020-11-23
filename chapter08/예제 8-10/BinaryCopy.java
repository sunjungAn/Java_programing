import java.io.*;

public class BinaryCopy {
	public static void main(String [] args) throws IOException
	{
		File src = new File("c:\\windows\\explorer.exe");
		File dst = new File("c:\\Users\\dkstj\\explorer.bin");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		int c;
		
		try {
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			while((c=in.read())!=-1)
			{
				out.write((char)c);
			}
			in.close();
			out.close();
			fo.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
	}
}
