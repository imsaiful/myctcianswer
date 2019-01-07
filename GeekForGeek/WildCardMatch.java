class WildCardMatch{
	public static void main(String[] args) {
		
		String	s = "baaabab";
		String p ="ba*a?";
		System.out.println(help(s,p));
	}

	public static boolean help(String s,String p){
		char[] st=s.toCharArray();
		char[] pt=p.toCharArray();
		int index=0;
		boolean flag=true;

		for(int i=0;i<pt.length;i++){
			if(pt[i]=='*'){
				if(flag){
					pt[index++]=pt[i];
					flag=false;
				}
			}
			else{
				pt[index++]=pt[i];
				flag=true;
			}
		}

		boolean[][] dp=new boolean[st.length+1][pt.length+1];
		dp[0][0]=true;

		if(index>0 && pt[0]=='*'){
			dp[0][1]=true;
		}

		for(int i=1;i<dp.length;i++){
			for(int j=1;j<dp[0].length;j++){
				if(st[i-1]==pt[j-1] || pt[j-1]=='?'){
					dp[i][j]=dp[i-1][j-1];
				}
				else if(pt[j-1]=='*'){
					dp[i][j]=dp[i-1][j] || dp[i][j-1];
				}

			}
		}

		return dp[st.length][index];


	}


}