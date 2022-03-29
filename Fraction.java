import java.lang.Math;


public class Fraction 
{
	int num;
	int denom;
	
	public Fraction(int newNum, int newDenom)
	{
		num = newNum;
		denom = newDenom;
		if(denom == 0)
			throw new ArithmeticException();
		reduce();
	}
	
	public int getNum()
	{
		return num;
	}
	
	public int getDenom()
	{
		return denom;
	}
	
	public void setNum(int n)
	{
		num = n;
		reduce();
	}
	
	public void setDenom(int n)
	{
		denom = n;
		if(denom == 0)
			throw new ArithmeticException();
		reduce();
	}
	
	
	//We sum the fractions a/b and c/d as (a*d+b*c)/b*d then reduce.
	public Fraction add(Fraction a)
	{
		//Fraction newFrac = new Fraction(3, 4);
		
		Fraction added = new Fraction((a.num * denom + a.denom * num), 
				a.denom * denom);
//		int g = gcd(added.num, added.denom);
//		
//		num /= g;
//		denom /= g;
//	
//		added.num = num;
//		added.denom = denom;
//		
//		if(added.denom == 0)
//			throw new ArithmeticException();
		
		return added;
	}
	
	/*
	 * 
	 */
	
	public void reduce()
	{
		int n = gcd(num, denom);
		num /= n;
		denom /= n;
	}
	
	public int gcd(int num, int denom)
	{
//		if(denom == 0)
//		{
//			return Math.abs(num);
//		}
//		else
//		{
//			return reduce(denom, num%denom);
//		}
		
		while(denom != 0)
		{
			int temp = denom;
			denom = num % denom;
			num = temp;
		}
		
		return num;
//		
		//while(num != denom)
//			if(num > denom)
//				num = num - denom;
//			else
//				denom = denom - num;
//		return num;
		
		
		
	}
	
	public boolean equals(Fraction a)
	{	
		if(num * a.denom == denom * a.num || num == a.num && denom == a.denom)
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return num + " / " + denom;
	}
}
