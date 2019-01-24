/*Find minimum number of coins that make a given value
Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?
Examples:

Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required
We can use one coin of 25 cents and one of 5 cents 

Input: coins[] = {9, 6, 5, 1}, V = 11
Output: Minimum 2 coins required
We can use one coin of 6 cents and 1 coin of 5 cents*/

class MinCoin{
	public static void main(String[] args) {
		int[] a={9,6,5,1};
		int v=11;
		int[] dp=new int[v+1];
		dp[0]=0;
		for(int i=1;i<=v;i++){
			dp[i]=Integer.MAX_VALUE;
		}
		for(int i=1;i<=v;i++){
			for(int j=0;j<a.length;j++){
				if(a[j]<=i){
					int sub_res=dp[i-a[j]];
					if(sub_res!=Integer.MAX_VALUE && sub_res+1<dp[i]){
						dp[i]=sub_res+1;
					}
				}
			}
		}
		System.out.println(dp[v]);
	}




}