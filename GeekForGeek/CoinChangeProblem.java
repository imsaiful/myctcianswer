class CoinChangeProblem{
	public static void main(String[] args) {
		 int a[] = {5, 2, 1}; 
		 int m=5;
		 Find_Change(a,a.length,m);
	}
	public static void Find_Change(int[] s,int n,int m){
		int[] dp=new int[m+1];
		dp[0]=1;
		for(int i=1;i<n;i++){
			for(int j=s[i];j<=m;j++){
				dp[j]+=dp[j-s[i]];
				
			}
			System.out.println();
		}
		System.out.println(dp[m]);
	}
}
