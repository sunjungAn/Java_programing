
class CurrencyConverter {
	private static double rate;
	public static void setRate(int num)
	{
		rate = num;
	}
	public static double toDollar(int num)
	{
		return num/rate;
	}
	public static double toKWR(int num)
	{
		return num*rate;
	}
}

public class StaticMember{
	public static void main(String[] args)
	{
		CurrencyConverter.setRate(1121);
		System.out.println("백만원은 "+CurrencyConverter.toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원입니다.");
		
	}
}