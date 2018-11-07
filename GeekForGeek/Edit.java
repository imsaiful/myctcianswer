class Edit{
	public static void main(String[] args) {
		String s1 = "sunday"; 
    	String s2 = "saturday";
    	int m=s1.length();
    	int n=s2.length();
    	int[][] dp=new int[m+1][n+1];
    	for(int i=0;i<=m;i++){
    		dp[i][0]=i;
    	}
    	for(int i=0;i<=n;i++){
    		dp[0][i]=i;
    	}

    	for(int i=1;i<=m;i++){
    		for(int j=1;j<=n;j++){
    			if(s1.charAt(i-1)==s2.charAt(j-1)){
    				dp[i][j]=dp[i-1][j-1];
    			}
    			else{
    				dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
    			}
    		}
    	}
    	System.out.println(dp[m][n]);

	}

	  
}