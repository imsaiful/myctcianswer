/*Given list of coins with various values (unlimited coins of each type) , find how many ways you can make a given value. (DP was expected.) Since it was not guaranteed that coin of value 1 would be present , we have to return -1 if the given value is not possible.*/

class CoinChangeProblemAmazon{
	public static void main(String[] args) {
		int n=5;
		int[] a={1,2,5};
		System.out.println(help(n,a));
	}
	public static int help(int sum,int[] coins){
		int[] dp=new int[sum+1];
		dp[0]=1;
		for(int coin:coins){
			for(int i=1;i<=sum;i++){
				if(i>=coin){
					dp[i]+=dp[i-coin];
				}
			}
		}
		return dp[sum];
	}
}