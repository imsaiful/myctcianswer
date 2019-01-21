class KnapSackZeroOne{
	public static void main(String[] args) {
		int val[] = {60, 100, 120}; 
    	int wt[] = {10, 20, 30}; 
    	int  W = 50;
    	System.out.println(Find_max(val,wt,W)); 
	}
	public static int Find_max(int[] val,int[] wt,int W){
		int n=val.length;
		int[][] dp=new int[n+1][W+1];
		for(int i=0;i<=n;i++){
			for(int w=0;w<=W;w++){
				if(i==0 || w==0){
					dp[i][w]=0;
				}
				else if(wt[i-1]<=w){
					dp[i][w]=Math.max(dp[i-1][w],dp[i-1][w-wt[i-1]]+val[i-1]);
				}
				else{
					dp[i][w]=dp[i-1][w];
				}
			}

		}
		return dp[n][W];
		
 

	}
}