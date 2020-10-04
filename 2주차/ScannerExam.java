import java.util.Scanner;

public class ScannerExam {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
		int age = scanner.nextInt();
		double kg = scanner.nextDouble();
		double cm = scanner.nextDouble();
		System.out.println("당신의 나이는 "+age+"살입니다.");
		System.out.println("당신의 체중은 "+kg+"kg입니다.");
		System.out.println("당신의 신장은 "+cm+"cm입니다.");
	}
}
