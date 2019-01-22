/*Find the maximum cost in traversing a 2-D matrix from one given cell to another. It is same as Min Cost Path DP problem.*/
class MinPath{
	public static void main(String[] args) {
		int a[][] = { {1, 2, 3}, 
                         {4, 8, 2}, 
                         {1, 5, 3} }; 
        int dp[][]=new int[a.length][a[0].length];
        dp[0][0]=a[0][0];
        for(int i=1;i<a.length;i++){
        	dp[i][0]=dp[i-1][0]+a[i][0];
        }
        for(int i=1;i<a.length;i++){
        	dp[0][i]=dp[0][i-1]+a[0][i];
        }
        for(int i=1;i<a.length;i++){
        	for(int j=1;j<a[0].length;j++){
        		dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+a[i][j];
        		System.out.print(dp[i][j]+"  ");
        	}
        	System.out.println();
        }
        System.out.println(dp[a.length-1][a[0].length-1]);


	}



}