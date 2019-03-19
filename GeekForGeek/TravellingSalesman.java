/*Travelling Sales Problem*/


class TravellingSalesman{
	static int VISITED_ALL=(1<<4)-1;
	public static void main(String[] args) {
		int[][] g={{0,20,42,25},{20,0,30,34},{42,30,0,10},{25,34,10,0}};
		System.out.println(help(g,1,0));
	}
	public static int help(int[][] g,int mask,int pos){
		if(mask==VISITED_ALL){
			return g[pos][0];
		}
		int ans=Integer.MAX_VALUE;
		for(int city=0;city<g.length;city++){
			if((mask&(1<<city))==0){
				int newAns=g[pos][city]+help(g,(mask|(1<<city)),city);
				ans=Math.min(ans,newAns);
			}
		}
		return ans;
	}
}