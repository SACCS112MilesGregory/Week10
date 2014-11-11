package week10Lab2;

public class RollADice 
{

	public static void main(String[] args) 
	{
		Dice firstDice = new Dice();
		Dice secondDice = new Dice();
		int countRolls = 0;
		int total1;
		int total2;
		int noDice;
		

			firstDice.Throw(); // Roll the first pair of dice.
			total1 = firstDice.dice1 + firstDice.dice2;
			System.out.println("First throw comes up " + total1 + ".");
			
			total2 = secondDice.Throw(3, true); // Roll the second pair of dice.
			System.out.println("Second throw comes up " + total2 + ".");

			noDice = Dice.OneDice(); // Roll the single dice.
			System.out.println("The single dice comes up " + noDice + ".");
			
			countRolls++;
			
			System.out.println(); // Blank line.
			
		
		System.out.println("It took " + countRolls +
				" rolls until the totals were the same.");
		
	} // class main()
} // end class RollTwoDice
