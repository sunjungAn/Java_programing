import java.util.Scanner;

public class DicManager {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Dictionary dic = new Dictionary();
		System.out.println("한영 단어 검색 프로그램입니다.");
		do {
			String order;
			System.out.print("한글 단어?");
			order = sc.next();
			if(order.equals("그만"))
				break;
			else
				System.out.println(order+"은 " +dic.kor2Eng(order));
		}while(true);
	}
}
