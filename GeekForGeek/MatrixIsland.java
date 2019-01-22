/*Find the number of islands | Set 1 (Using DFS)
Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island. For example, the below matrix contains 5 islands

Example:

Input : mat[][] = {{1, 1, 0, 0, 0},
                   {0, 1, 0, 0, 1},
                   {1, 0, 0, 1, 1},
                   {0, 0, 0, 0, 0},
                   {1, 0, 1, 0, 1} 
Output : 5
This is a variation of the standard problem: “Counting the number of connected components in an undirected graph”.*/
class MatrixIsland{
	public static void main(String[] args) {
		int[][] a = {{1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 1},
                     {1, 0, 0, 1, 1},
                     {0, 0, 0, 0, 0},
                     {1, 0, 1, 0, 1}};	
        System.out.println(help(a));

	}
	public static int help(int[][] a){
		int isLand=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]==1){
					isLand++;
					destroy(a,i,j);
				}
			}
		}
		return isLand;
	}
	public static void destroy(int[][] a,int i,int j){
		a[i][j]=0;
		if(i<a.length-1 && a[i+1][j]==1){
			destroy(a,i+1,j);
		}
		if(i>0 && a[i-1][j]==1){
			destroy(a,i+1,j);
		}
		if(j<a[0].length-1 && a[i][j+1]==1){
			destroy(a,i,j+1);
		}
		if(j>0 && a[i][j-1]==1){
			destroy(a,i,j-1);
		}
	}
}