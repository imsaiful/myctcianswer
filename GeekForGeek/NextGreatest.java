/* Print Next Greatest */

class NextGreatest{
	public static void main(String[] args) {
		int[] a= {11, 13, 21, 3};
		int n=a.length;
		/*for(int i=0;i<n;i++){
			int next=-1;
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					next=a[j];
					break;
				}
			}
			System.out.print(next+" ");
		}*/
		Stack<Integer> st=new Stack<Integer>();
		st.push(a[0]);


	}
}