/*Travelling Sales Problem*/


class TravellingSalesman{
	static int VISITED_ALL=(1<<4)-1;
	public static void main(String[] args) {
		int[][] g={{0,20,42,25},{20,0,30,34},{42,30,0,10},{25,34,10,0}};
		int[][] dp=new int[1<<4][g[0].length];

		for(int i=0;i<(1<<4);i++){
			for(int j=0;j<4;j++){
				dp[i][j]=-1;
			}
		}
		System.out.println(help(g,dp,1,0));
	}
	public static int help(int[][] g,int[][] dp,int mask,int pos){
		if(mask==VISITED_ALL){
			return g[pos][0];
		}
		if(dp[mask][pos]>-1){
			return dp[mask][pos];
		}
		int ans=Integer.MAX_VALUE;
		for(int city=0;city<g.length;city++){
			if((mask&(1<<city))==0){
				int newAns=g[pos][city]+help(g,dp,(mask|(1<<city)),city);
				ans=Math.min(ans,newAns);
			}
		}
		return dp[mask][pos]=ans;
	
	}
}