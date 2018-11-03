class UnboundKnapsack{
	public static void main(String[] args) {
		int W = 100;
       int val[]  = {1, 30};
       int wt[] = {1, 50};
        System.out.println(find_maximum(W,val,wt));

	}
	public static int find_maximum(int W,int[] val,int[] w){
		int n=w.length;
		int[] dp=new int[W+1];
		for(int i=0;i<=W;i++){
			for(int j=0;j<n;j++){
				if(w[j]<=i){
					dp[i]=Math.max(dp[i],dp[i-w[j]]+val[j]);
				}
			}
		}
		return dp[W];
	}
}