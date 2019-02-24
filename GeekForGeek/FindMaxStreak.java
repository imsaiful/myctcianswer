/*Find the longest path in a matrix with given constraints
Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell) such that all cells along the path are in increasing order with a difference of 1.

We can move in 4 directions from a given cell (i, j), i.e., we can move to (i+1, j) or (i, j+1) or (i-1, j) or (i, j-1) with the condition that the adjacent cells have a difference of 1.

Example:

Input:  mat[][] = {{1, 2, 9}
                   {5, 3, 8}
                   {4, 6, 7}}
Output: 4
The longest path is 6-7-8-9. */


class FindMaxStreak{
		public static void main(String[] args) {
				int mat[][] = {{1, 2, 9},
                			   {5, 3, 8},
                   				{4, 6, 7}};
        		System.out.println(help(mat));
	}
	public static int help(int[][] mat){
		int[][] dp=new int[mat.length][mat[0].length];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				dp[i][j]=-1;
			}
		}
		int result=1;
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				if(dp[i][j]==-1){
					dp[i][j]=CountPath(i,j,mat,dp);
				}
				result=Math.max(result,dp[i][j]);
			}
		}
		return result;
	}
	public static int CountPath(int i,int j,int[][] mat,int[][] dp){
		int n=mat.length;
		if(i<0 || i>= n || j<0 || j>= n){
			return dp[i][j];
		}

		if(i>0 && mat[i][j]+1==mat[i-1][j]){
			return dp[i][j]=1+CountPath(i-1,j,mat,dp);
		}

		if(i<n-1 && mat[i][j]+1==mat[i+1][j]){
			return dp[i][j]=1+CountPath(i+1,j,mat,dp);
		}

		if(j>0 && mat[i][j]+1==mat[i][j-1]){
			return dp[i][j]=1+CountPath(i,j-1,mat,dp);
		}

		if(j<n-1 && mat[i][j]+1==mat[i][j+1]){
			return dp[i][j]=1+CountPath(i,j+1,mat,dp);
		}
		return dp[i][j]=1;
	}





}