
public class AsciiArt 
{
	static final int SIZE = 3;
	
	public static void main(String[] args) 
	{
		topDiamond();
		bottomDiamond();
	}
	
	public static void topDiamond()
	{
		for(int lines = 1; lines <= SIZE; lines++)
		{
			System.out.print("|");
			for(int spaces = 1; spaces <= (lines * -2 + (2 * SIZE)); spaces++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int prec = 1; prec <= (lines * 4 - 3); prec++)
			{
				System.out.print("%");
			}
			
			System.out.print("*");
			
			for(int spaces = 1; spaces <= (lines * -2 + (2 * SIZE)); spaces++)
			{
				System.out.print(" ");
			}
			
			System.out.println("|");
		}
	}
	
	public static void bottomDiamond()
	{
		for(int lines = SIZE; lines >= 1; lines--)
		{
			System.out.print("|");
			for(int spaces = 1; spaces <= (lines * -2 + (2 * SIZE)); spaces++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int prec = (lines * 4 - 3); prec > 0; prec--)
			{
				System.out.print("%");
			}
			
			System.out.print("*");
			
			for(int spaces = 1; spaces <= (lines * -2 + (2 * SIZE)); spaces++)
			{
				System.out.print(" ");
			}
			
			System.out.println("|");
		}
	}
	
}
