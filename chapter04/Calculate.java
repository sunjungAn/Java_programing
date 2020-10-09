import java.util.Scanner;

public class Calculate {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int oper1; int oper2; char order;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		oper1 = sc.nextInt();
		oper2 = sc.nextInt();
		order = sc.next().charAt(0);
		if(order == '+')
		{
			Add add = new Add();
			add.setValue(oper1, oper2);
			System.out.println(add.calculate());
		}
		else if(order == '-')
		{
			Sub sub = new Sub();
			sub.setValue(oper1, oper2);
			System.out.println(sub.calculate());
		}
		else if(order == '*')
		{
			Mul mul = new Mul();
			mul.setValue(oper1, oper2);
			System.out.println(mul.calculate());
		}
		if(order == '/')
		{
			Div div = new Div();
			div.setValue(oper1, oper2);
			System.out.println(div.calculate());
		}
	}

}
