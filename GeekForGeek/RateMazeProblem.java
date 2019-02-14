/*Rat in a Maze | Backtracking-2
We have discussed Backtracking and Knight’s tour problem in Set 1. Let us discuss Rat in a Maze as another example problem that can be solved using Backtracking.
A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination. The rat can move only in two directions: forward and down.
In the maze matrix, 0 means the block is a dead end and 1 means the block can be used in the path from source to destination. Note that this is a simple version of the typical Maze problem. For example, a more complex version can be that the rat can move in 4 directions and a more complex version can be with a limited number of moves.

Following is an example maze.

 Gray blocks are dead ends (value = 0). 


Following is binary matrix representation of the above maze.

                {1, 0, 0, 0}
                {1, 1, 0, 1}
                {0, 1, 0, 0}
                {1, 1, 1, 1}
Following is a maze with highlighted solution path.



Following is the solution matrix (output of program) for the above input matrx.

                {1, 0, 0, 0}
                {1, 1, 0, 0}
                {0, 1, 0, 0}
                {0, 1, 1, 1}
 All enteries in solution path are marked as 1.*/


class RateMazeProblem{
	public static void main(String[] args) {
		int[][] a={{1, 0, 0, 0}, 
		            {1, 1, 0, 1}, 
		            {0, 1, 0, 0}, 
		            {1, 1, 1, 1} 
		        };
		SolveMaze(a);
	}

	public static void SolveMaze(int[][] a){
		int[][] s={{0, 0, 0, 0}, 
		            {0, 0, 0, 0}, 
		            {0, 0, 0, 0}, 
		            {0, 0, 0, 0} 
		        };
		if(isPossible(a,0,0,s)){
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(s[i][j]+"  ");
				}
				System.out.println();
			}
			
		}
		else{
			System.out.println("No solution is possible");
		}
	}

	public static boolean isPossible(int[][] a,int x , int y , int[][] s){
		if(x==3 && y==3){
			s[x][y]=1;
			return true;
		}
		if(isSafe(a,x,y)){
			s[x][y]=1;
			if(isPossible(a,x+1,y,s)){
				return true;
			}
			if(isPossible(a,x,y+1,s)){
				return true;
			}
			s[x][y]=0;
			return false;
		}
		return false;
	}

	public static boolean isSafe(int[][] a,int x,int y){
		return x>=0 && x<4 && y>=0 && y<4 && a[x][y]==1;
	}



}