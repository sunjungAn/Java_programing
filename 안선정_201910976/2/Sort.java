
public class Sort {
	public static void main(String [] args)
	{
		int len = args.length;
		for(int i = 0; i<len-1; i++)
		{
			for(int j = i+1; j<len; j++)
			{
				if(Integer.parseInt(args[i]) <Integer.parseInt(args[j]))
				{
					String temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
			}
		}
		System.out.print("정렬결과는 다음과 같습니다.: ");
		for(int i = 0; i<len; i++)
		{
			System.out.print(args[i]+" ");
		}
		System.out.println();

	}
}
