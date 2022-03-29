
public class fractionMain 
{

	public static void main(String[] args) 
	{
		Fraction newFrac = new Fraction(1, 2);
		
		System.out.println(newFrac);
		
		newFrac.setNum(2);
		newFrac.setDenom(4);
		System.out.println(newFrac);
		Fraction frac = new Fraction (2, 4);
		System.out.println(frac);	
		Fraction added = newFrac.add(frac);
		System.out.println(newFrac + " + " + frac + " = " + added);
		
		System.out.println(newFrac.equals(frac));

	}

}
