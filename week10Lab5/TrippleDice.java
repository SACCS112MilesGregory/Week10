package week10Lab5;

public class TrippleDice extends Dice
{
	@Override
	public double Throw()
	{
		double average = 0.0;
		average = (super.Throw() + super.Throw() + super.Throw()) / 3;
		
		return average;
	}
}
