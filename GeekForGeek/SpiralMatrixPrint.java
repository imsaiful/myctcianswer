/* Write a recursive code to print a matrix in spiral order. */
class SpiralMatrixPrint{
	public static void main(String[] args) {
		int[][] a={{1,4,7,10},{2,5,8,11}};
		Print(a,0);
	}
	public static void Print(int[][] a,int level){
		int m=a.length;
		int n=a[0].length;
		 if(level>=m){
		 	return;
		 }
		 int left=level,right=n-1-level,top=level,bottom=m-1-level;

		 for(int j=left;j<right;j++){
		 	System.out.print(a[top][j]+" ");
		 }


		 for(int j=top;j<bottom;j++){
		 	System.out.print(a[j][right]+" ");
		 }


		 for(int j=right;j>left;j--){
		 	System.out.print(a[bottom][j]+" ");
		 }


		 for(int j=bottom;j>top;j--){
		 	System.out.print(a[j][left]+" ");
		 }

    	Print(a,level+1);
	}
}