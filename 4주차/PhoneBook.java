import java.util.Scanner;

class Phone{
	public static String name;
	public static String tell;
	
	public Phone(String name, String tell)
	{
		this.name = name;
		this.tell = tell;
	}
}
public class PhoneBook {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 >> ");
		int man = sc.nextInt();
		Phone [] phone = new Phone[man];
		
		for(int i = 0; i<man; i++)
		{
			String name; String tell;
			System.out.print("이름과 전화번호(이름과 변호는 빈 칸없이 입력)>>");
			name = sc.next();
			tell = sc.next();
			phone[i] = new Phone(name, tell);
		}
		System.out.println("저장되었습니다.");
		do {
			String order;
			System.out.print("검색할 이름>>");
			order = sc.next();
			if(order.equals("그만"))
				break;
			else {
				int i;
				for(i = 0; i<man; i++)
				{
					if((phone[i].name).equals(order)) {
						System.out.println(order+"의 변호는 "+phone[i].tell+"입니다.");
						break;
					}
				}
				if(i== man)
					System.out.println(order+" 이 없습니다.");
			
			}
		}while(true);
	}
}
