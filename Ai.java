import java.security.SecureRandom;
public class Ai {
	//this was a lot easier to do in my head...
	public static void AIAttack(int[][]grid)
	{
		int indicator=1;
		
		while(indicator==0) {
			int x =guessX(grid.length);
			int y = guessY(grid[0].length);
			//if it's correct
		if(grid[x][y]==1||grid[x][y]==2)
			{
			//indicates that if it were an island, it's now hit.
			grid[x][y]=hit(grid[x][y]);
			indicator =1;
			}
		//Checks if it's water, then marks it as an "hit" tile.
		//I'm using 4 for a "revealed tile" number,
		//3 is a "hit battleship" number.
		//Forgot to integrate splash damage
		}
	}
	//I just put in two different coordinate methods so
	//that I don't have to bother with figuring out how to return two.
	public static int guessX(int x)
	{
		SecureRandom rand = new SecureRandom();
		return rand.nextInt(x);
	}
	public static int guessY(int y)
	{
		SecureRandom rand = new SecureRandom();
		
		
		return rand.nextInt(y);
	}
	//Checks to see whether it's an island or water and
	//sets it to be either a hit island, or just a revealed space.
	public static int hit(int x)
	{
		if(x==1)
			return 3;
		else
			return 4;
	}
}
