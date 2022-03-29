
public class Car 
{
	String make;
	String model;
	int year;
	double MPG;
	int milesDriven;
	int fuelCapacity;
	int fuelRemaining;
	
	public Car(String carMake, String carModel, int carYear, double milPGal, 
				int mileDriven, int fuelCapa, int fuelRemain)
	{
		make = carMake;
		model = carModel;
		year = carYear;
		MPG = milPGal;
		milesDriven = mileDriven;
		fuelCapacity = fuelCapa;
		fuelRemaining = fuelRemain;
	}
	
	public void fillTank(double g)
	{
		if(g + fuelRemaining > fuelCapacity)
			fuelRemaining = fuelCapacity;
		else
			fuelRemaining = (int) (g + fuelRemaining);
	}
	
	public void drive(double m)
	{
		milesDriven += m;
		if(m >= MPG)
		{
			fuelRemaining --;
		}
		
	}
	
	public String toString()
	{
		return "(" + make + ", " + model + ", " + year + ", " + MPG + ", "
					+ milesDriven + ", " + fuelCapacity + ", " + fuelRemaining + 
					")";
	}
	
	public int getFuelRemaining()
	{
		return fuelRemaining;
	}
}
