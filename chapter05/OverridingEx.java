class DObject{
	public DObject next;
	
	public DObject() {next = null;}
	public void draw() {
		System.out.println("DObject draw");
	}
}
class Line extends DObject{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends DObject{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends DObject{
	public void draw() {
		System.out.println("Circle");
	}
}

public class OverridingEx {
	public static void main(String [] args)
	{
		DObject start, n, obj;
		start = new Line();
		n = start;
		obj = new Rect();
		n.next = obj;
		n = obj;
		obj = new Line();
		n.next = obj;
		n = obj;
		obj = new Circle();
		n.next = obj;
		
		while(start != null)
		{
			start.draw();
			start = start.next;
		}
	}
}
