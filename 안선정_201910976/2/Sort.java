
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
		for(int i = 0; i<len; i++)
		{
			System.out.print(args[i]+" ");
		}
		System.out.println();

	}
}
