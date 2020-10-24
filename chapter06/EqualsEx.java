class Rect{
	int width;
	int height;
	
	public Rect(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public boolean equals(Rect r2)
	{
		if(width*height == r2.width*r2.height)
			return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String []args)
	{
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		
		if(a.equals(b)) System.out.println("a is equals to b");
		if(a.equals(c)) System.out.println("a is equals to c");
		if(b.equals(c)) System.out.println("b is equals to c");
		
	}
}
