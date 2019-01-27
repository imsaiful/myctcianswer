/*1) Given a array of number find the next greater no in the right of each element*/

class NextGreatesInArray{
	public static void main(String[] args) {
		int[] a={12,15,22,9,7,2,18,23,27};
		int[] l=new int[a.length];
		int n=a.length;
		l[n-1]=0;
		for(int i=n-2;i>=0;i--){
			int j=i+1;
			while(j>0){
				if(a[i]<a[j]){
					l[i]=j;
					break;
				}
				j=l[j];
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();

		for(int i=1;i<n-1;i++){
			System.out.print(a[l[i]]+"  ");
		}
		System.out.print(l[n-1]);

	}
}