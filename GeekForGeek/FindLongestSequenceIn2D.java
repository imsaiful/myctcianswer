/*17


12
I have been presented with a new homework assignment that has been somewhat frustrating to say the least. Basically, I have a create a 2D array of integers as follows:

97 47 56 36 60 31 57 54 12 55 
35 57 41 13 82 80 71 93 31 62 
89 36 98 75 91 46 95 53 37 99 
25 45 26 17 15 82 80 73 96 17 
75 22 63 96 96 36 64 31 99 86 
12 80 42 74 54 14 93 17 14 55 
14 15 20 71 34 50 22 60 32 41 
90 69 44 52 54 73 20 12 55 52 
39 33 25 31 76 45 44 84 90 52 
94 35 55 24 41 63 87 93 79 24
and I am to write a recursive method, or function as you will, to calculate the longest increasing sub sequence. In this example, the longest increasing sub sequence is the following:

(5,0)   with value 12
(6,0)   with value 14
(6,1)   with value 15
(6,2)   with value 20
(7,2)   with value 44
(7,3)   with value 52
(7,4)   with value 54
(6,3)   with value 71
(5,3)   with value 74
(4,3)   with value 96*/

class FindLongestSequenceIn2D{
	public static void main(String[] args) {
		int[][] a={{7,1,9,6,8},{2,7,9,2,3},{3,5,2,0,5},{3,1,0,7,7}};
		int[][] ls=new int[a.length][a[0].length];
		int m=a.length;
		int n=a[0].length;
		int result=1;
		for(int i=m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				int target=a[i][j];
				int cur=1;
				for(int ii=i;ii<m;ii++){
					for(int jj=j;jj<n;jj++){
						int ll=1;
						if(target<a[ii][jj]){
							ll+=ls[ii][jj];
						}
						cur=Math.max(cur,ll);
					}
				}
				ls[i][j]=cur;
				result=Math.max(cur,result);
			}
		}
		System.out.println(result+" ");


	}



}