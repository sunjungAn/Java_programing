import java.util.Scanner;

public class GoodsArray {
	public static void main(String [] args)
	{
		Goods gd[] = new Goods[3];
		Scanner sc = new Scanner(System.in);
		String name; 
		int price;
		int numberOfStock;
		int sold;
		
		System.out.println("상품 세개를 차례로 입력하라.");
		for(int i = 0; i<3; i++)
		{
			name = sc.next();
			price = sc.nextInt();
			numberOfStock = sc.nextInt();
			sold = sc.nextInt();
			gd[i] = new Goods(name, price, numberOfStock, sold);
		}
		System.out.println("입력된 상품 정보는 다음과 같습니다");
		for(int i = 0; i<3; i++)
		{
			System.out.println(gd[i].getName()+" "+gd[i].getPrice()+" "+gd[i].getNumberOfStock()+" "+gd[i].getSold());
		}
		
	}
}
