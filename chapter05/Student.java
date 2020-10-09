class Person
{
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public void set(int weight)
	{
		this.weight = weight;
	}
	public int get()
	{
		return weight;
	}
}

public class Student extends Person{
	void set() {
		age = 30;
		name = "ȫ�浿";
		height = 160;
		set(50);
	}
	public static void main(String [] args)
	{
		Student s = new Student();
		s.set();
	}
}