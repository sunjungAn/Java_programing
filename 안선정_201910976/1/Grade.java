import java.util.Scanner;

public class Grade {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("학점을 입력하세요.:");
		c = sc.next().charAt(0);
		switch(c)
		{
		case 'A':
		case 'B':
		case 'C':
			System.out.println("참 잘하였습니다.");
			break;
		case 'D':
		case 'E':
			System.out.println("좀 더 노력하세요.");
			break;
		case 'F':
			System.out.println("다음 학기에 다시 수강하세요.");
			break;	
		}	
	}
}
