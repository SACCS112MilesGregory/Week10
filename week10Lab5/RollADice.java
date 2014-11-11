package week10Lab5;

public class RollADice 
{

	public static void main(String[] args) 
	{
		//ThreeDice DiceGame = new ThreeDice();
		//Dice diceGame = new Dice();
		TrippleDice trippleDice = new TrippleDice();

		//DiceGame.toString();
		//System.out.println(DiceGame.toString());
		//System.out.println(diceGame.toString());
		System.out.printf("The average is : %.2f", trippleDice.Throw());
	} // class main()
} // end class RollADice
