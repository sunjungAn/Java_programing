import java.io.*;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String [] args)
	{
		InputStreamReader in = new InputStreamReader(System.in);
		int c;
		FileWriter fout;
		System.out.println();
		try {
			fout = new FileWriter("C:\\Users\\dkstj\\test.txt");
			while((c = in.read())!= -1) {
				fout.write((char)c);
			}
			fout.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
	}
}
