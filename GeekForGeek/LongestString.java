class LongestString{
	public static void main(String[] args) {
		 String s="abcda";
		 char[] s1=s.toCharArray();
		 char[] s2=reverse(s1);
		 int n=s.length();
		 int[][] dp=new int[n+1][n+1];
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		if(i==0 || j==0){
		 			dp[i][j]=0;
		 			
		 		}
		 		else if(s1[i-1]==s2[j-1]){
		 			dp[i][j]=dp[i-1][j-1]+1;
		 			
		 		}
		 		else{
		 			dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		 			
		 		}
		 	}
		 
		 }

		 System.out.println(n-dp[n][n]);




	}

	public static char[] reverse(char[] s1){
		char[] temp=new char[s1.length];
		int index=0;
		for(int i=s1.length-1;i>=0;i--){
			temp[index++]=s1[i];
		}
		return temp;
	}
}