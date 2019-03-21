/*Sorted Matrix*/

class SortedMatrix1{
	public static void main(String[] args) {
		int[][] m={{0,0,0,0,1},{0,0,0,1,1},{0,0,0,1,1},{0,1,1,1,1},{0,0,1,1,1}};
		System.out.println(help(m));
	}
	public static int help(int[][] m){
		int r=0;
		int c=m.length-1;
		int row=0;
		while(r<m.length && c>=0){
			if(m[r][c]==1){
				c--;
				row=r;
			}
			else{
				r++;
			}
		}
		return row+1;





	}





}