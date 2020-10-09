import java.util.Scanner;

public class MyExp {
	int base;
	int exp;
	
	public int getValue()
	{
		int result = 1;
		for(int i = 1; i<=exp; i++)
			result *= base;
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MyExp my = new MyExp();
		my.base = sc.nextInt();
		my.exp = sc.nextInt();
		System.out.println(my.base+"ÀÇ "+my.exp+"½Â = "+my.getValue());
	}
}
