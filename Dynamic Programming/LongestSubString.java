/* Longest Palindromic Substring | Set 1
Given a string, find the longest substring which is palindrome. For example, if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”. */

class LongestSubString{
	public static void main(String[] args) {
		String s="forgeeksskeegfor";
		System.out.println(help(s));	
	}

	public static int help(String s){
		int n=s.length();
		boolean[][] dp=new boolean[n][n];
		for(int i=0;i<n;i++){
			dp[i][i]=true;
		}
		int start=0;
		int max=0;
		for(int i=0;i<n-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				dp[i][i+1]=true;
				start=i;
				max=2;
			}
		}

		for(int k=3;k<=n;k++){
			for(int i=0;i<n-k+1;i++){
				int j=i+k-1;
				if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)){
					dp[i][j]=true;
					if(k>max){
						max=k;
						start=i;
					}
				}
			}
		}
		for(int i=start;i<start+max;i++){
			System.out.print(s.charAt(i));
		}
		return max;




	}
}