class MaxProd{
	public static void main(String[] args) {
		int[] a={-1, -3, -4, 2, 0, -5} ;
		int n=a.length;
		int maxa=Integer.MIN_VALUE;
		int maxb=Integer.MIN_VALUE;
		int mina=Integer.MAX_VALUE;
		int minb=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]>maxa){
				maxb=maxa;
				maxa=a[i];
			}
			else if(a[i]>maxb){
				maxb=a[i];
			}
			if(a[i]<mina){
				minb=mina;
				mina=a[i];
			}
			else if(a[i]>minb){
				minb=a[i];
			}
		}	
		System.out.println(Math.max(maxa*maxb,mina*minb));


	}
}