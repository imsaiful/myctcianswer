class MaxGap{
	public static void main(String[] args) {
		int[] ar={3,5,4,2};
		for(int k=0;k<ar.length;k++){
			System.out.print(ar[k]+" ");
		}
		System.out.println();
		int n=ar.length;
		int[] a=new int[n];
		a[0]=ar[0];
		for(int i=1;i<a.length;i++){
			a[i]=Math.min(ar[i],a[i-1]);
		}
		int[] b=new int[n];
		b[n-1]=ar[n-1];
		for(int i=n-2;i>=0;i--){
			b[i]=Math.max(ar[i],b[i+1]);
		}
		int i,j;
		i=j=0;
		int max=Integer.MIN_VALUE;
		for(int k=0;k<ar.length;k++){
			System.out.println(a[k]+" "+b[k]);
		}
		while(i<n && j<n){
			if(a[i]<=b[j]){
				max=Math.max(max,j-i);
				j++;
			}
			else{
				i++;
			}
		}
		System.out.println(max);
	}
}