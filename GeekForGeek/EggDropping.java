//Egg Dropping Puzzle
class EggDropping{
	public static void main(String[] args) {
		help_fun(36,2);
	}
	public static void help_fun(int floor,int egg){
		int[][] T=new int[egg+1][floor+1];
		for(int i=0;i<=floor;i++){
			T[1][i]=i;
		}
		int c=0;
		for(int e=2;e<=egg;e++){
			for(int f=2;f<=floor;f++){
				T[e][f]=Integer.MAX_VALUE;
				for(int k=1;k<=f;k++){
					c=1+Math.max(T[e-1][k-1],T[e][f-k]);
					if(c<T[e][f]){
						T[e][f]=c;
					}
				}
			}
		}
		System.out.println(T[egg][floor]);





	} 



}