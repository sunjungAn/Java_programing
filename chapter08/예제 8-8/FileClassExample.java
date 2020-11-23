import java.io.*;

public class FileClassExample {
	public static void dir(File fd)
	{
		String [] filenames = fd.list();
		for(String s: filenames) {
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t파일 크기: "+f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t,t,t,t);
		}
	}
	public static void main(String [] args)
	{
		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("c:\\Users\\dkstj\\tmp\\java_sample");
		File f3 = new File("c:\\Users\\dkstj\\tmp");
		String res;
		if(f1.isFile())
			res = "파일";
		else
			res = "디렉터리";
		
		System.out.println(f1.getPath()+"은 " +res+"입니다.");
		if(!f2.exists()) {
			if(!f2.mkdir())
				System.out.println("디렉터리 생성 실패");
		if(f2.isFile())
			res= "파일";
		else
			res = "디렉터리";
		System.out.println(f2.getPath()+"은 "+res+"입니다. ");
		dir(f3);
		
		f2.renameTo(new File("c:\\tmp\\javasample"));
		dir(f3);
		}
	}
}
