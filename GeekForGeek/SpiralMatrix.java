class SpiralMatrix{
	public static void main(String[] args) {
		int[][] a={ {1,  2,  3,  4,  5,  6}, 
        			{7,  8,  9,  10, 11, 12}, 
        			{13, 14, 15, 16, 17, 18} 
    }; 
		int k=0;//start row
		int m=a.length-1;//end row
		int l=0;//start column
		int n=a[0].length-1;//end coloumn
		while(k<=m && l<=n){
			for(int i=l;i<=n;i++){
				System.out.print(a[k][i]+" ");
			}
			k++;
			for(int i=k;i<=m;i++){
				System.out.print(a[i][n]+" ");
			}
			n--;

			if(k<m){
					for(int i=n;i>=l;i--){
						System.out.print(a[m][i]+" ");
					}
				m--;
			}
			if(l<n){
					for(int i=m;i>=k;i--){
						System.out.print(a[i][l]+" ");
					}
				l++;
			}
		}
	}
}
