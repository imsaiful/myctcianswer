import java.util.*;
class ZeroMatrix{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=in.nextInt();
			}
		}
		SetZero(a);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();

		}
	}
		public static void SetZero(int[][] a){
			System.out.println("Call..");
			int r=a.length;
			int c=a[0].length;
			boolean row[]=new boolean[r];
			boolean col[]=new boolean[c];
			for(int i=0;i<r;i++){

				for(int j=0;j<c;j++){
					if(a[i][j]==0){
						System.out.println("Call..0..");
						row[i]=true;
						col[j]=true;
					}
				}
			} 
			for(int i=0;i<r;i++){
				if(row[i]){
					NullifyRow(a,i);
				}
			}
			for(int i=0;i<c;i++){
				if(col[i]){
					NullifyCol(a,i);
				}
			}
		}
	public static void NullifyRow(int[][] a,int row){
			System.out.println("Call....");
			for(int i=0;i<a.length;i++){
				a[row][i]=0;
				
			}

		} 
		public static void NullifyCol(int[][] a,int col){
			System.out.println("Call..c..");
			for(int i=0;i<a[0].length;i++){
				a[i][col]=0;
			
			}
		} 


}