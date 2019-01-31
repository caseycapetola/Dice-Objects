
public class DiceMain 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		for(int i = 0; i<10; i++)
			System.out.println(dice1.roll());
		for(int i = 0; i<20; i++)
			System.out.println(dice2.roll());
		
		System.out.println("Die1: " + dice1.getNumRolls() + "\nDie2: " + dice2.getNumRolls());

	}

}
