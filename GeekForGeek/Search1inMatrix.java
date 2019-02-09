/*Find a row with maximum number of 1’s in a sorted 2D Boolean matrix.*/

class Search1inMatrix{
	public static void main(String[] args) {
		int[][] a={{0,0,0,1},{0,0,1,1},{0,0,1,1},{0,1,1,1},{0,0,0,0},{0,0,0,0}};
		System.out.println(help(a));
	}
	public static int help(int[][] a){
		int c=a[0].length-1;
		int r=0;
		int n=a.length;
		int max=-1;
		while(r<n && c>=0){
			if(a[r][c]==1){
				max=r;
				r++;
			}
			else{
				c--;
			}
		}
		return max;
	}
}