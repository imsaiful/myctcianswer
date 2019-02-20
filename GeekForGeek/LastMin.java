/*• Write a code to find the previous shorter element in an array.
Input:
2
6
7 2 3 4 5 1
6
10 2 8 9 11 2
Output:
-1 -1 2 3 4 -1
-1 -1 2 8 9 -1*/

class LastMin{
	public static void main(String[] args) {
		int[] a={10,9,8,7,6,5,3,2,1};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		help(a);	
	}
	public static void help(int[] a){
		int[] temp=new int[a.length];
		temp[0]=-1;
		for(int i=1;i<a.length;i++){
			int j=i-1;
			while(j!=-1){
				if(a[j]<a[i]){
					temp[i]=j;
					break;
				}
				j=temp[j];
			}
			if(j==-1){
				temp[i]=-1;
			}
		}
		for(int i=0;i<a.length;i++){
			if(temp[i]!=-1){
				System.out.print(a[temp[i]]+" ");
			}
			else{
				System.out.print("-1 ");	
			}
		}
	}
}