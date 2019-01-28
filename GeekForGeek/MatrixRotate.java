class MatrixRotate{
	public static void main(String[] args){
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int m=a.length;
		int n=a[0].length;
		System.out.println("Given Marix");
		Print(a);
		int[][] temp=new int[a.length][a[0].length];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				temp[i][j]=a[j][i];
			}
		}
		for(int k=0;k<m;k++){
			for(int i=0,j=n-1;i<n/2;i++,j--){
				int t=temp[k][i];
				temp[k][i]=temp[k][j];
				temp[k][j]=t;
			}

		}
		System.out.println("Marix After Rotatet Clockwise 90 degree");
		Print(temp);
	}
	public static void Print(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}