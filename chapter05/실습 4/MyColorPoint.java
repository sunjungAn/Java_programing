
public class MyColorPoint extends MyPoint{

	String color;
	protected void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	protected void reverse () {
		int temp = this.x;
		this.x = this.y;
		this.y = temp;
	}
	
	protected void show(){
		System.out.println(x+", "+y+", "+color);
	}
	
	MyColorPoint(int x, int y, String color){
		super(x,y);
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3, "blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
