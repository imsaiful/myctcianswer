/*Longest Repeating Subsequence
Given a string, find length of the longest repeating subseequence such that the two subsequence don’t have same string character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.*/

class LongestRepeat{
	public static void main(String[] args) {
		String s="abcdefbcd";
		System.out.println(help(s));
	}
	public static int help(String s){
		int n=s.length();
		int[][] dp=new int[n+1][n+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0){
					dp[i][j]=0;
				}
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(i-1)==s.charAt(j-1) && i!=j){
					dp[i][j]=1+dp[i-1][j-1];
				}
				else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);	
				}
			}
		}
		return dp[n][n];
	}




}