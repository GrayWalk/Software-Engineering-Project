import java.util.Random;

public class IslandGen{
	public static int[][] createIsland(int area){
		Random rand = new Random();
		int[][] isle = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				isle[i][j] = 1;
			}
		}
		
		int seedX = (rand.nextInt(3));
		int seedY = (rand.nextInt(3));
		isle[seedX][seedY] = 2;
		
		fillAdj(isle,seedX,seedY,area-1);
		
		return isle;
	}//createIsland
	
	public static void fillAdj(int[][] arr, int x, int y, int area){
		int count = 0;
		Random rand = new Random();
		int dir = (rand.nextInt(4));
		while(count < area){
		int[] points = new int[2];
		points = pickPoint(arr);
		x = points[0];
		y = points[1];
			switch(dir){
				case 0:
					if(x+1 < 3 && arr[x+1][y] == 1){
						x++;
						arr[x][y] = 2;
						count++;
					}
					else
						dir = (rand.nextInt(4));
					break;
				case 1:
					if(x-1 >= 0 && arr[x-1][y] == 1){
						x--;
						arr[x][y] = 2;
						count++;
					}
					else
						dir = (rand.nextInt(4));
					break;
				case 2:
					if(y+1 < 3 && arr[x][y+1] == 1){
						y++;
						arr[x][y] = 2;
						count++;
					}
					else
						dir = (rand.nextInt(4));
					break;
				case 3:
					if(y-1 >= 0 && arr[x][y-1] == 1){
						y--;
						arr[x][y] = 2;
						count++;
					}
					else
						dir = (rand.nextInt(4));
					break;
				default:
					System.out.println("Error with dir");
			}//switch
		}//while
	}//fillAdj
	
	public static int[] pickPoint(int[][] arr){
		int[] points = new int[2];
		Random rand = new Random();
		int x,y;
		do{
			x = (rand.nextInt(3));
			y = (rand.nextInt(3));
		}while(arr[x][y] != 2);
		points[0] = x;
		points[1] = y;
		return points;
	}
}//IslandGen