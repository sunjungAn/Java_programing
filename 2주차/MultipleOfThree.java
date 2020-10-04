import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args)
	{
		System.out.print("수를 입력하시오: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num % 3 == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
	}
}
