import java.util.Scanner;
interface Stack{
	public int length();
	public void pop();
	public Boolean push(Object ob);
}

class StringStack implements Stack{
	private int top;
    private int maxSize;
    private Object stringStackArray[];
    
    public StringStack(int maxSize) {
    	this.top = -1;
    	this.maxSize = maxSize;
    	stringStackArray = new Object[this.maxSize];
    }
	
	public boolean isEmpty() {
		
		return (top == -1);
	}
	
	public boolean isFull() {
		if(top >= this.maxSize) {
			return true;
		}
		else {
			return false;
		}
	}
    
	public int length() {
		return (this.top+1);
	}
	
	public void pop() {
		//stringStackArray[this.top] = "\0";
		if(isEmpty()){
			System.out.println("스택이 비었습니다. ");
			//return null;
		}
		else {
			System.out.println("삭제 : "+stringStackArray[this.top--]);
			//return stringStackArray;
		}
	}
	
	public Boolean push(Object ob) {
		this.top++;
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다. ");
			return false;
		}
		else {
			stringStackArray[this.top] = ob;
			System.out.println("Push item : " + stringStackArray[this.top]);
			return true;
		}

	}
	
	public static void main(String [] args)
	{
		String s;
		StringStack stack = new StringStack(100);
		Scanner sc = new Scanner(System.in);
		int n; 
		while(true)
		{
			System.out.print("push(1) pop(2) exit(3):");
			n = sc.nextInt();
			if(n == 1)
			{
				System.out.print("넣을 문자열 : ");
				s = sc.next();
				stack.push(s);
				
			}
			else if(n == 2)
				stack.pop();
			else
				break;
		}
	}
}