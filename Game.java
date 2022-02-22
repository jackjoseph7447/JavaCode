import java.util.Scanner;
import java.util.Random;

public class Game 
{

	public static void main(String[] args) 
	{
		//State the instructions
		printInstructions();
		//create input for user
		//user plays game
		gameCode(askUser());
		
		

	}

	public static void printInstructions()
	{
		System.out.println("Pershult beats Klyket, Skadis");
		System.out.println("Klyket beats Tjusig, Hovolm");
		System.out.println("Tjusig beats Pershult, Skadis");
		System.out.println("Skadis Beats Hovolm, Klyket");
		System.out.println("Hovolm beats Pershult, Tjusig");
	}
	
	public static String askUser()
	{
		Scanner scan = new Scanner(System.in);
		//prompt user about playing
		System.out.print("Would you like to play? ");
		String user = scan.nextLine();
		while(user.equals("y") != true && user.equals("n") != true)
		{
			System.out.print("Error: invalid entry. Please enter y or n.\n");
			System.out.print("Would you like to play? ");
			user = scan.nextLine();
		}
		
		return user;
	}
	
	public static void gameCode(String userAnswer)
	{
		int gameCount = 0;
		int userWinCount = 0;
		int compWinCount = 0;
		int roundsPlayed = 0;
		String compTurn;
		String userTurn;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(userAnswer.equals("y"))
		{
			System.out.print("Enter a move: ");
			userTurn = scan.nextLine();
			while(checkUserTurn(userTurn) != true)
			{
				System.out.print("Error: invaild entry. Please enter one of the five moves.\n");
				System.out.print("Enter a move: ");
				userTurn = scan.nextLine();
			}
			
			System.out.println("Your move is " + userTurn);
			int compNum = rand.nextInt(5) + 1;
			compTurn = computerTurn(compNum);
			System.out.println("The computer picked " + compTurn);
			
			if(whoWins(userTurn, compTurn))
				userWinCount++;
			
			else
				compWinCount++;
			
			roundsPlayed++;
			
			System.out.print("Would you like to play again? ");
			userAnswer = "";
			userAnswer = scan.nextLine();
		}
		
		results(roundsPlayed, userWinCount, compWinCount);
		
	}
	
	public static boolean checkUserTurn(String turn)
	{
		String check = turn.toLowerCase();
		if(check.equals("Skadis".toLowerCase()) == false && check.equals("Tjusig".toLowerCase()) == false && 
				check.equals("Klyket".toLowerCase()) == false && check.equals("Hovolm".toLowerCase()) == false &&
				check.equals("Pershult".toLowerCase()) == false)
				return false;
		
		return true;
	}
	
	public static String computerTurn(int num)
	{
		String compWord = "";
		if(num == 1)
			compWord = "Skadis".toLowerCase();
		else if(num == 2)
			compWord = "Tjusig".toLowerCase();
		else if(num == 3)
			compWord = "Klyket".toLowerCase();
		else if(num == 4)
			compWord = "Hovolm".toLowerCase();
		else if(num == 5)
			compWord = "Pershult".toLowerCase();
		return compWord;
	}
	
	public static boolean whoWins(String userTurn, String compTurn)
	{
		if(userTurn.toLowerCase().equals("Pershult".toLowerCase()) && compTurn.equals("Klyket".toLowerCase()) || compTurn.equals("Skadis".toLowerCase()))
		{
			userWon();
			return true;
		}
		
		else if(userTurn.toLowerCase().equals("Klyket".toLowerCase()) && compTurn.equals("Tjusig".toLowerCase()) || compTurn.equals("Hovolm".toLowerCase()))
		{
			userWon();
			return true;
		}
		
		else if(userTurn.toLowerCase().equals("Tjusig".toLowerCase()) && compTurn.equals("Pershult".toLowerCase()) || compTurn.equals("Skadis".toLowerCase()))
		{
			userWon();
			return true;
		}
		
		else if(userTurn.toLowerCase().equals("Skadis".toLowerCase()) && compTurn.equals("Hovolm".toLowerCase()) || compTurn.equals("Klyket".toLowerCase()))
		{
			userWon();
			return true;
		}
		
		else if(userTurn.toLowerCase().equals("Hovolm".toLowerCase()) && compTurn.equals("Pershult".toLowerCase()) || compTurn.equals("Tjusig".toLowerCase()))
		{
			userWon();
			return true;
		}
		
		else if(userTurn.toLowerCase().equals(compTurn.toLowerCase()))
		{
			System.out.println("Better luck next time");
			return false;
		}
		
		else
		{
			System.out.println("Better luck next time");
			return false;
		}
	}
	
	public static void userWon()
	{
		System.out.println("Congradulations! You won!");
	}
	
	public static void results(int rounds, int userWin, int compWin)
	{
		System.out.println("You played " + rounds + " games");
		System.out.println("You won " + userWin +" times");
		System.out.println("You lost " + compWin + " times");
		
	}
}
