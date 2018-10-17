class CountTriplet{
	public static void main(String[] args) {
		int[] a={5, 1, 3, 4, 7};
		int sum=12;
		System.out.println(Count(a,sum));
	}
	public static int Count(int[] a,int sum){
		int n=a.length;
		int count=0;
		for(int i=0;i<n-2;i++){
			int j=i+1;
			int k=n;
			while(j<k){
				if(a[i]+a[j]+a[k]>=sum){
					k--;
				}
				else{
					count++;
					j++;
				}
			}
		}
		return count;
	}
}