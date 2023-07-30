package easy;

public class CountTheWords {

	public static void main(String[] args) 
	{
		CountTheWords no_of_words = new CountTheWords();
			//Object creation
		String s = "How are you";
			//String value
		int wordcount = no_of_words.count(s);
			//Storing the splited values in int format under wordcount variable
		System.out.println(wordcount);
	}
	
	
	public int count(String s)
	{
		String[] split = s.trim().split("\\s");
			//String[] split - Stores the string in array
			//trim().split("\\s") - trims the string based on the spaces
		return split.length;
			//split.length - Returns the length of the word
	}
}
