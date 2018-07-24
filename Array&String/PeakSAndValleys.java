class PeakSAndValleys{
	public static void main(String[] args){

		int a[]={2,9,5,3,1,13,52,78,99,44};
		Wave(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
	public static void Wave(int[] a){
		for(int i=1;i<a.length;i+=2){
			int bi=swap(i-1,i,i+1,a);
			if(bi!=i){
				int temp=a[i];
				a[i]=a[bi];
				a[bi]=temp;
			}
		}
	}

	static int swap(int a,int b,int c,int[] ar){
		int l=ar.length;
		int av=a>=0&&a<l?ar[a]:Integer.MIN_VALUE;
		int bv=b>=0&&b<l?ar[b]:Integer.MIN_VALUE;
		int cv=c>=0&&c<l?ar[c]:Integer.MIN_VALUE;
		int max=Math.max(av,Math.max(bv,cv));
		if(av==max)
			return a;
		else if(bv==max)
			return b;
		else 
			return c;
	}



}