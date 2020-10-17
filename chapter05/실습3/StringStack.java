import java.util.Scanner;

public class StringStack implements Stack{
	String element [];
	public int index;
	public StringStack(int num) {
		element = new String[num];
		index = 0;
		
	}
	public int length()
	{
		return index;
	}
	
	public Object pop(){
		if(index > 0)
		{
			index--;
			return element[index];
		}
		else {
			System.out.println("원소가 없습니다.");
			return null;
		}
		
	}
	public Boolean push(Object ob)
	{
		if(element.length == index) {
			System.out.println("스택이 다 찼습니다.");
			return false;
		}
		else{ 
			element[index++] = ob.toString();
			return true;
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		StringStack stack = new StringStack(10);
		String text = sc.next();
		stack.push(text);
		System.out.println("length : "+stack.length());
		System.out.println("pop : "+stack.pop());
		System.out.println("length : "+ stack.length());
		
	}
	
}
