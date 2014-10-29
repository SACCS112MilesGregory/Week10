package week10Lab3;

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
}
