class FindXOrSum{
	public static void main(String[] args) {
		int[] a={3, 5, 2, 4, 6}; 
		int r=0;
		int n=a.length;
		for(int i=0;i<n;i++){
			int f=(i+1)*(n-i);
			if(f%2==1){
				r^=a[i];
			}
		}
		System.out.println(r);
	}
}