package week10Lab4a;

public class Dice
{
	int value = 0;
	int numOfDice = 1;
	static int numOfThrows = 0;
	
	public int Throw()
	{
		int dice;
		dice = (int)(Math.random() * 6) + 1;
		return dice;
	}
	@override
	public String toString()
	{
		return String.format("Number of Dice: %d, with value: %d.\n", 
				numOfDice, value);
	}
} // end class Dice
