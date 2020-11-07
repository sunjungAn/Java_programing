class Cpoint
{
	int n1;
	int n2;
	String color;
	
	public Cpoint(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	public void show()
	{
		System.out.println("("+n1+","+n2+")"+color);
	}
}

public class CColorPoint extends Cpoint{
	
    CColorPoint(int n1, int n2, String color){
        super(n1,n2);
        this.color = color;
    }

	public void main(String [] args)
	{
		Cpoint a,b;
		a = new Cpoint(2,3);
		b = new CColorPoint(3,4," red");
		a.show(); //출력
		b.show(); //출력
		System.out.println(a); //출력
		System.out.println(b); //출력
		
	}
}