package week10Lab3;

public class Dice 
{
	public int Throw()
	{
		int dice;
		dice = (int)(Math.random() * 6) + 1;
		return dice;
	}
} // end class Dice
