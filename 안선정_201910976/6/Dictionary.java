
public class Dictionary {
	private static String[] kor = {"»ç¶û","¾Æ±â","µ·","¹Ì·¡","Èñ¸Á"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word)
	{
		for(int i = 0; i<kor.length; i++)
		{
			if(kor[i].equals(word))
				return "Àº "+eng[i];
		}
		return "´Â ÀúÀÇ »çÀü¿¡ ¾ø½À´Ï´Ù.";
	}

}
