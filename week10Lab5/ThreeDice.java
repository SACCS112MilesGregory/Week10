package week10Lab5;

public class ThreeDice
{
	Dice D1 = new Dice();
	Dice D2 = new Dice();
	Dice D3 = new Dice();

	public double Throw()
	{
		double numOfDices = 0;
	numOfDices = (D1.Throw() + D2.Throw() + D3.Throw());
		
	return numOfDices;
	}
	
	@Override
	public String toString()
	{
		return String.format("The number of dices is: %d", Throw());
	}
	
} // end class ThreeDice
