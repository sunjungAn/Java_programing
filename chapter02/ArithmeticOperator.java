import java.util.Scanner;

public class ArithmeticOperator {
	public static void main (String[] args)
	{
		int time;
		int sec;
		int min;
		int hour;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		time = scanner.nextInt();
		sec = time % 60;
		min = (time/60)%60;
		hour=(time/60)/60;
		
		System.out.print(time+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
		
	}
}
