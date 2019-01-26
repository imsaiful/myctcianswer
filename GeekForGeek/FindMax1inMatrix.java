class FindMax1inMatrix{
	public static void main(String[] args) {
		int[][] m = { {0, 0, 0, 1}, 
                       {0, 1, 1, 1}, 
                       {1, 1, 1, 1}, 
                       {0, 0, 0, 0}}; 
  		int j=m[0].length-1;
  		int row=0;
  		int i;
  		
  		for(i=0;i<m.length;i++){
  			while(j>=0 && m[i][j]==1){
  				row=i;
  				j--;
  			}
  		}
  		System.out.print(row+1);



	}
}			