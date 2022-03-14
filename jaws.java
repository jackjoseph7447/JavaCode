import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;


public class jaws {

	public static void main(String[] args) 
	throws FileNotFoundException{
		String fileName = "jawsScript.txt";
		PrintStream outToFile = new PrintStream(new File("SouthernJaws.txt"));
		
		Scanner fromFile = new Scanner(new File(fileName));

		while(fromFile.hasNext())
		{
			String word = fromFile.next();
			word = word.replaceAll("\\p{Punct}", ""); // gets rid of all punct.
			
			System.out.println(word);
			String newWords = southAccent(word);			
			for(int i = 0; i < newWords.length(); i++)
			{
				outToFile.print(newWords.charAt(i));
			}
			outToFile.println();
			
			System.out.println(newWords);
			
			
		}
		outToFile.close();
		System.out.print("Done");
		
	}
	
	public static String southAccent(String word)
	{
		String newWord = "";
		
		
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			if(word.charAt(0) == 'r' || word.charAt(0) == 'R')
			{
				newWord += c;
			}
			
			else if(c == 'r' || c == 'R' && isVowel(word.charAt(i - 1)))
			{
				newWord += 'h';
			}
			
			else
			{
				newWord += c;
			}
			
		}

//		if(word.charAt(word.length() - 1) == 'a')
//			newWord += "r";
		
		if(newWord.equals("very"))
			newWord = "wicked";
		
		return newWord;
	}

	
	
	public static boolean isVowel(char c)
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		for(int i = 0; i < vowels.length; i++)
		{
			if(vowels[i] == c)
				return true;
		}
		
		return false;
	}
}

