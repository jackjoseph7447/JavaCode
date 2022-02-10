
public class Song 
{

	public static void main(String[] args) 
	{
		verseOne();
		System.out.println();
		verseTwo();
		System.out.println();
		verseThree();
		System.out.println();
		verseFour();
		System.out.println();
		verseFive();
		System.out.println();
		verseSix();
		System.out.println();
		
		
		
	}

	
	public static void lineOne()
	{
		System.out.println("Bought me a cat and the cat pleased me,");
	}
	
	public static void lineTwo()
	{
		System.out.println("I fed my cat under yonder tree.");
	}
	
	public static void lineThree()
	{
		System.out.println("Cat goes fiddle-i-fee.");
	}
	
	public static void verseOne()
	{
		lineOne();
		lineTwo();
		lineThree();
	}
	
	public static void lineFour()
	{
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	
	public static void verseTwo()
	{
		lineOne();
		lineTwo();
		lineFour();
		lineThree();
	}
	
	public static void lineFive()
	{
		System.out.println("Duck goes quack, quack,");
	}
	
	public static void verseThree()
	{
		lineOne();
		lineTwo();
		lineFive();
		lineFour();
		lineThree();
	}
	
	public static void lineSix()
	{
		System.out.println("Goose goes hissy, hissy,");
	}
	
	public static void verseFour()
	{
		lineOne();
		lineTwo();
		lineSix();
		lineFive();
		lineFour();
		lineThree();
	}
	
	public static void lineSeven()
	{
		System.out.println("Sheep goes baa, baa,");
	}
	
	public static void verseFive()
	{
		lineOne();
		lineTwo();
		lineSeven();
		lineSix();
		lineFive();
		lineFour();
		lineThree();
	}
	
	public static void verseSix()
	{
		System.out.println("I wanted to make this as neat as possible,\nbut there are a lot of functions.");
	}
}
