import java.util.Random;

public class Dice 
{
	//Create fields
	//fields always get private access
	
	private int numRolls = 0;
	
	public int roll()
	{
		Random rand = new Random();
		int num = rand.nextInt(6) + 1; //generates a value from 0 to 6, 0 is inclusive, 6 is exclusive
		numRolls++;
		return num;
		
	}
	
	public int getNumRolls()
	{
		return numRolls;
	}
	
	public void reset()
	{
		numRolls = 0;
	}
	
	
}
