class Goods {
	
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}
