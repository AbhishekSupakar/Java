class StringSplitting 
{
	public static void main(String[] args) 
	{
		String a = "Hello,World!,abc,xyz";
		String[] words = a.split("l");

		for(int i=0; i<words.length; i++)
		{
			System.out.println(words[i]);
		}
        
	}
}
