/* given a coordinate (x,y) in a matrix of 0’s , make all the diagonals element
through (x,y) as 1 in that matrix.*/

class MakeDiaginalZero{
	public static void main(String[] args) {
		int[][] a={{0,1,1,0,0,1,1,0},{1,1,1,0,0,1,1,0},{0,0,0,0,0,1,1,0},{0,0,1,0,0,1,1,0},{0,1,1,0,0,1,1,0},{1,1,1,0,0,1,1,0},{0,0,0,0,0,1,1,0},{0,0,1,0,0,1,1,0}};
		Print(a);
		help(a);
		Print(a);
	}
	public static void Print(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("<==== END GAME====>");	
	}

	public static void help(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(i==j){
					a[i][j]=1;
				}
				else{
					a[i][j]=0;	
				}
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=a[0].length-1;j>=0;j--){
				if(i+j==a.length-1){
					a[i][j]=1;
				}
				else if(a[i][j]!=1){
					a[i][j]=0;	
				}
			}

		}
		



	}

}