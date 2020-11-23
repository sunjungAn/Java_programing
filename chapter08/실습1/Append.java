import java.io.*;
import java.util.Scanner;

public class Append {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("text file1 :");
		String t1 = sc.next();
		System.out.print("test file2 : ");
		String t2 = sc.next();
		t1 = "c:\\Users\\dkstj\\tmp\\"+t1+".txt";
		t2 = "c:\\Users\\dkstj\\tmp\\"+t2+".txt";
		File f1 = new File(t1);
		File f2 = new File(t2);
		File f3 = new File("c:\\Users\\dkstj\\tmp\\append.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f3);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c=in.read())!=-1)
			{
				out.write((char)c);
			}
			fr.close();
			fr = new FileReader(f2);
			in = new BufferedReader(fr);
			while((c=in.read())!=-1)
			{
				out.write((char)c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		
		}catch (IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
		
	}
}
