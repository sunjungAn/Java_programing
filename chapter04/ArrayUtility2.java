
public class ArrayUtility2 {
	static int[] concat(int []s1, int [] s2)
	{
		int len = s1.length+s2.length;
		int [] s = new int[len];
		int k = 0;
		for(int i=0; i<s1.length; i++)
		{
			s[k++]=s1[i];
		}
		for(int j = 0; j<s2.length; j++)
		{
			s[k++]=s2[j];
		}
		return s;
	}
	
	static int[] remove(int []s1, int []s2) //s1에서 s2에 있는 원소들을 다 빼는 함수로 작성하였다. 
	{
		int len = s1.length;
		int k=0;
		int[]s = new int[len];
		for(int i = 0; i<s1.length;i++)
		{
			int j;
			for(j = 0; j<s2.length; j++)
			{
				if(s1[i]==s2[j]) {
					break;
				}
			}
			if(j==s2.length) {
				s[k++]=s1[i];
			}
		}
		int [] res = new int[k];
		for(int i= 0; i<k; i++)
			res[i] = s[i];
		return res;
	}
	
}
