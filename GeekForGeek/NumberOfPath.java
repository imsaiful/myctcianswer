/* Given a m*n matrix, find the number of paths to reach m*n from 1*1..*/


class NumberOfPath{
	public static void main(String[] args) {
		int[][] a={{1,1,1,1},{1,0,0,0},{1,0,0,0},{1,0,0,0}};
		System.out.println(help(a));
	}
	public static int help(int[][] a){
		int m=a.length;
		int n=a.length;
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		return a[m-1][n-1];



	}
}