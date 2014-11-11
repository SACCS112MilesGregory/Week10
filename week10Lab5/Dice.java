package week10Lab5;

public class Dice 
{
	public double Throw()
	{
		int dice;
		dice = (int)(Math.random() * 6) + 1;
		return dice;
	}
	
		
	@Override
	public String toString()
	{
		return String.format("The current value is: %d", Throw());
	}
} // end class Dice
