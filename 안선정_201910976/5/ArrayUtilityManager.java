
public class ArrayUtilityManager {
	public static void main(String[] args)
	{
		ArrayUtility au = new ArrayUtility();
		int [] s1 = {1,2,3,4};
		int [] s2 = {3,4,5,6};
		
		int [] res_concat = au.concat(s1, s2);
		int [] res_remove = au.remove(s1, s2);
		
		System.out.print("concat의 결과: ");
		for(int i = 0; i<res_concat.length; i++)
			System.out.print(res_concat[i]+" ");
		System.out.println();
		System.out.print("remove의 결과: ");
		for(int j = 0; j<res_remove.length; j++)
			System.out.print(res_remove[j]+" ");
		
		
	}
}
