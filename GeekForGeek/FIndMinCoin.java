/*1. Find minimum number of coins that make a given value
Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?*/

import java.util.*;

class FIndMinCoin{
	public static void main(String[] args) {
		int[] a={1,3,5};
		int sum=11;
		int[] dp=new int[sum+1];
		Arrays.fill(dp,sum+11);
		dp[0]=0;
		for(int i=1;i<=sum;i++){
			for(int j=0;j<a.length;j++){
				if(a[j]<=i){
					dp[i]=Math.min(dp[i],1+dp[i-a[j]]);
					//System.out.print(dp[i]+"  ");
				}
			}
		}	
		if(dp[sum]<sum){
			System.out.println(dp[sum]);
		}
		else{
			System.out.println("-1");	
		}
	}
}
