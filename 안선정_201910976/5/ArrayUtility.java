
public class ArrayUtility {
	static int [] concat(int [] s1, int [] s2)
	{
		int s3 [] = new int[s1.length+s2.length];
		int k = 0;
		for(k = 0; k<s1.length; k++)
		{
			s3[k] = s1[k];
		}
		for(int i = 0; i<s2.length; i++)
		{
			s3[k++] = s2[i]; 
		}
		return s3;
	}
	
	static int [] remove(int [] s1, int [] s2)
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