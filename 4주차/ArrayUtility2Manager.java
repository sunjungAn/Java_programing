
public class ArrayUtility2Manager {
	public static void main(String [] args)
	{
		int s1[] = {1,2,3,4,5,6,7,8,9,10};
		int s2[] = {2,4,6,8,10};
		ArrayUtility2 util = new ArrayUtility2();
		int[] result1 = util.concat(s1, s2);
		System.out.println("concat결과");
		for(int i = 0; i<result1.length; i++)
		{
			System.out.print(result1[i]+" ");
		}
		System.out.println();
		int[] result2 = util.remove(s1, s2);
		System.out.println("remove결과");
		for(int i = 0; i<result2.length; i++)
		{
			System.out.print(result2[i]+" ");
		}
		
	}
}
