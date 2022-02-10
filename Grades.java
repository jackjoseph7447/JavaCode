import java.util.*;

public class Grades 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Homework Weight? ");
		int homeworkWeight = scan.nextInt();
		
		System.out.print("Exam 1 weight? ");
		int examOneWeight = scan.nextInt();
		int examTwoWeight = homeworkWeight - examOneWeight;
		System.out.println("Using Weights of " + homeworkWeight + " " + examOneWeight + " " + examTwoWeight);
		System.out.println("Homework: ");
		
		System.out.print("Number of assignments? ");
		int assignNumber = scan.nextInt();
		
		System.out.print("Average Homework grade? ");
		double aveHomeworkGrade = scan.nextDouble();
		
		System.out.print("Number of late days used? ");
		int lateDays = scan.nextInt();
		
		System.out.print("Labs attended? ");
		int labAttend = scan.nextInt();
		
		double homeworkPoints = weightedHomeworkScore(homeworkWeight, assignNumber, aveHomeworkGrade, labAttend);
		System.out.print("Weighted Score = " + String.format("%.2f", homeworkPoints) + "\n");
		
		System.out.println("Exam One: ");
		System.out.println("Score? ");
		int examOneScore = scan.nextInt();
		
		System.out.print("Curve? ");
		int curveOne = scan.nextInt();
		int totalScoreOne = examOneScore + curveOne;
		if(totalScoreOne > 100)
		{
			totalScoreOne = 100;
		}
		
		double examOnePoints = weightedExamOneScore(totalScoreOne, examOneWeight, curveOne);
		System.out.println("Total Points = " + totalScoreOne + " / 100");
		System.out.print("Weighted Score = " + examOnePoints + "\n");
		
		System.out.println("Exam Two: ");
		System.out.println("Score? ");
		int examTwoScore = scan.nextInt();
		
		System.out.print("Curve? ");
		int curveTwo = scan.nextInt();
		
		int totalScoreTwo = examTwoScore + curveTwo;
		if(totalScoreTwo > 100)
		{
			totalScoreTwo = 100;
		}
		
		double examTwoPoints = weightedExamTwoScore(totalScoreTwo, examTwoWeight, curveTwo);
		System.out.println("Total Points = " + totalScoreTwo + " / 100");
		System.out.print("Weighted Score = " + examTwoPoints + "\n");
		
		//Adds points if the student has 0 late days
		if(lateDays == 0)
		{
			homeworkPoints += 5;
			if(homeworkPoints > 100)
			{
				homeworkPoints = 100;
			}
		}
		
		double grade = courseGrade(homeworkPoints, examOnePoints, examTwoPoints);
		
		//deducts points if student has more late days than half of the assignments
		if(assignNumber / 2 < lateDays)
		{
			double deduct = grade / 10.0;
			grade = grade - deduct;
		}
		
		System.out.println("Course grade = " + String.format("%.2f", grade));
	}

	public static double weightedHomeworkScore(double weight, double assignNum, double aveHW, double labPresent)
	{
		double homeworkScore = weight * (aveHW * assignNum + labPresent * 4) / (10 * 10 + 4 * 10);
		return homeworkScore;
	}
	
	public static double weightedExamOneScore(double examScore, double weight, double curve)
	{
		double examOnePoints = 0.0;
		
		if(curve >= 0)
		{
			examOnePoints = weight * examScore / 100;
		}
		
		else
		{
			examScore += curve;
			if(examScore > 100)
			{
				examScore = 100;
			}
			examOnePoints = weight * examScore / 100;
		}
			
		return examOnePoints;
	}
	
	public static double weightedExamTwoScore(double examScore, double weight, double curve)
	{
		double examTwoPoints = 0.0;
		
		if(curve >= 0)
		{
			examTwoPoints = weight * examScore / 100;
		}
		
		else
		{
			examScore += curve;
			if(examScore > 100)
			{
				examScore = 100;
			}
			examTwoPoints = weight * examScore / 100;
		}
			
		return examTwoPoints;
	}
	
	public static double courseGrade(double homeworkGrade, double examOneGrade, double examTwoGrade)
	{
		return homeworkGrade + examOneGrade + examTwoGrade;
	}
	
}
