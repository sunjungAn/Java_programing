
class CurrencyConverter {
	private static double rate;
	
	static void setRate(double num)
	{
		rate = num;
	}
	static double toDollar(double money)
	{
		return money/rate;
	}
	static double toKWR(double money)
	{
		return money*rate;
	}
	
}
