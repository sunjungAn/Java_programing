import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException
	{
		FileReader fr = null;
		try {
			fr = new FileReader("C://Windows//system.ini");
			int c;
			while((c = fr.read())!= -1)
			{
				System.out.print((char)c);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일 읽기 오류");
			e.printStackTrace();
		}
		
	}
}
