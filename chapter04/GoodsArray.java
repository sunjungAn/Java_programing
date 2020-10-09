import java.util.Scanner;

class Goods
{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods(String n, int p, int nStock, int s)
	{
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
	
}

public class GoodsArray {
	public static void main(String[] args)
	{
		Goods [] goods = new Goods[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++)
		{
			String name = sc.next();
			int price = sc.nextInt();
			int number = sc.nextInt();
			int sold = sc.nextInt();
			goods[i] = new Goods(name, price, number, sold);
			
		}
		for(int j = 0; j<3; j++)
		{
			System.out.println(goods[j].getName()+" "+goods[j].getPrice()+" "+goods[j].getNumberOfStock()+" "+goods[j].getSold());
		}
	}
}
