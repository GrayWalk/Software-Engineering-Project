import java.security.SecureRandom;
public class PuzzlePieceGrids {

	public static void main(String[] args) {
		System.out.println("This program should test inserting a smaller grid into it's larger counterpart of a multiple of 3");

		int [][] smallGrid = {{1,2,1},{1,2,1},{1,2,1}};
		int [][] bigGrid = new int[9][9];
		for(int i=0;i<9;i++)
			gridInGrid(smallGrid,bigGrid);
		printGrid(bigGrid);
		
	}
	
	//Hopefully this should check and place the small array into the larger array.
	public static int[][] gridInGrid(int[][]smallGrid, int[][]bigGrid)
	{
		if(smallGrid.length==3 && smallGrid[0].length==3 && bigGrid.length %3==0 && bigGrid[0].length %3==0 && bigGrid.length==bigGrid[0].length)
		{
			//2d array to mark which sectors are filled/unfilled.
			//1 is filled, 0 is unfilled.
			int [][] sector = new int[bigGrid.length/3][bigGrid.length/3];
			//Used for randomly selecting sector to put small grid in.
			int randomSelector = sector.length;
			SecureRandom rand = new SecureRandom();
			//Marking process for the sector array:
			//Nested for loop, set "full" sectors to 1.
			for(int i=0;i<sector.length;i++)
				for(int j=0;j<sector[0].length;j++)
				{
					if(bigGrid[i*3][j*3]>0)
						sector[i][j]=1;
				}
			boolean indicator = true;
			//Check if it's already full, then set to true if it is.
			for(int i=0; i<sector.length;i++)
				for(int j=0; j<sector[0].length;j++)
					if(sector[i][j]==0)
						indicator=false;
			//If there are open spots, guess until it lands on one.
			while(indicator == false)
			{
				int guess1 = rand.nextInt(randomSelector);
				int guess2 = rand.nextInt(randomSelector);
				if(sector[guess1][guess2]==0)
				{
					for(int i = 0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							bigGrid[guess1*3+i][guess2*3+j]=smallGrid[i][j];
						}
					}
					indicator=true;
				}
			}
			
			
			return bigGrid;
		}
		else 
		System.out.println("These grids don't meet the size requirements");
		return smallGrid;
	}
	
	
	
	
	//Just to check that it actually put it in.
	public static void printGrid(int[][]arr)
	{
		  for (int i = 0; i < arr.length; i++) { 
			  
	            System.out.print("["); 
	            for (int j = 0; j < arr[0].length; j++) { 
	                System.out.print(" " + arr[i][j] + ", "); 
	            } 
	            System.out.print("], ");
	            System.out.println();
		  }
	}
}
