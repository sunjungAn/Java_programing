import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String [] args)
	{
		File src = new File("c:\\Users\\dkstj\\tmp\\a.jpg");
		File dst = new File("c:\\Users\\dkstj\\tmp\\b.jpg");
		long size = src.length();
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
			int count = 0;
			while((c = in.read())!= -1)
			{
				count++;
				if(count%(size/10)==0)
					System.out.print("*");
				out.write((char)c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		}catch (IOException e) {
			System.out.println("파일 복사 오류.");
		}
	}
}
