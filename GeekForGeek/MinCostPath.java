/*Min Cost Path | DP-6
Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that returns cost of minimum cost path to reach (m, n) from (0, 0). Each cell of the matrix represents a cost to traverse through that cell. Total cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination). You can only traverse down, right and diagonally lower cells from a given cell, i.e., from a given cell (i, j), cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. You may assume that all costs are positive integers.
int cost[R][C] = { {1, 2, 3}, 
                      {4, 8, 2}, 
                      {1, 5, 3} }; 


For example, in the following figure, what is the minimum cost path to (2, 2)?
*/

class MinCostPath{
	public static void main(String[] args) {
		int[][] a={ {1, 2, 3}, 
                      {4, 8, 2}, 
                      {1, 5, 3} };
        System.out.println(help(a));              	
	}
	public static int help(int[][] a){
		int[][] temp=new int[a.length][a[0].length];
		temp[0][0]=a[0][0];
		for(int i=1;i<a.length;i++){
			temp[i][0]=temp[i-1][0]+a[i][0];
		}
		for(int i=1;i<a[0].length;i++){
			temp[0][i]=temp[0][i-1]+a[0][i];
		}
		for(int i=1;i<a.length;i++){
			for(int j=1;j<a[0].length;j++){
				temp[i][j]=a[i][j]+Math.min(temp[i-1][j-1],Math.min(temp[i-1][j],temp[i][j-1]));
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(temp[i][j]+"  ");
			}
			System.out.println();
		}
		return temp[a.length-1][a[0].length-1];
	}
}