import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String [] args)
	{
		File src = new File("c:\\Users\\dkstj\\tmp\\a.jpg");
		File dst = new File("c:\\Users\\dkstj\\tmp\\b.jpg");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		int c;
		try {
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo, 1024);
			while((c = in.read())!= -1)
			{
				out.write((char)c);
			}
			out.flush();
			
			if(in != null)
			{
				in.close();
				out.close();
			}
			fi.close();
			fo.close();
		}catch (IOException e) {
			System.out.println("파일 복사 오류.");
		}
	}
}
