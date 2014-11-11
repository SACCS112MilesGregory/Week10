package week10Lab2;

public class Dice 
{
	final static boolean DEBUG = true;
	public int dice1; // Number showing on the first dice.
	public int dice2; // Number showing on the second dice.
	int numOfDice = 1;
	static int dice;
	static int dices;
	static int numOfThrows = 0;
	boolean even;
	boolean stop;
	private int result;
	
	public Dice(int dices, boolean even)
	{
		this.even = even;
		numOfDice = (dices > 0) ? dices : 1;
	}
	
	public int getNumOfThrows()
	{
		return numOfThrows;
	}
	
	public Dice()
	{
		// Constructor. Rolls the dice to initially show a random value.
		Throw(); // Call the roll() method to roll the dice.
	}
	public Dice(int dice1, int dice2, boolean even)
	{
		
		this.even = even;
		// Constructor. Rolls the dice to initially show a random value.
		Throw(); // Call the roll() method to roll the dice.
	}
	public int Value()
	{
		return dice1 + dice2;
	}
	
	public int Throw()
	{
			// Roll the dice by setting each of the dice to be
			// a random number between 1 and 6.
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		return dice1 + dice2;
	}
	public int Throw(int dices, boolean even)
	{
		int total;
		do
		{
			total = 0;
			for(int i = 0; i < dices; i++)
			{
				total = total + (int)(Math.random() * 6) + 1;
			}
			result = total % 2;
			
			if(even)
			{
				if (result == 0)
					stop = true;
				else
					stop = false;
			}
			
			if(!even)
			{
				if(result == 1)
					stop = false;
				else
					stop = true;
			}
		} while (!stop);
		numOfThrows++;
		return total;
	}
	
	public static int OneDice()
	{
		dice = (int)(Math.random() * 6) +1;
		return dice;
	}
} // end class Dice
