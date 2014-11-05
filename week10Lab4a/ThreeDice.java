package week10Lab4a;

public class ThreeDice
{
	Dice D1 = new Dice();
	Dice D2 = new Dice();
	Dice D3 = new Dice();

	public double Throw()
	{
		double average;
	average = (D1.Throw() + D2.Throw() + D3.Throw())/3;
	
	return average;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s\n%s: %s\n%s: %s",
				"Dice 1", D1,
				"Dice 2", D2,
				"Dice 3", D3);
	}
}
