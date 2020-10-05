class Sample{
	public int a;
	private int b;
	int c;
	protected int d;
	
	void init(int b){
		this.b = b;
	}
}
public class AccessEx {

	public static void main(String []args)
	{
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.init(10);
		aClass.c = 10;
		aClass.d = 10;
	}
}
