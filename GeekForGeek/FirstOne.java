class FirstOne{
	public static void main(String[] args) {
		int[] a={0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		int x=help(a);
		System.out.println(x);
	}
	public static int help(int[] a){
		int low=0;
		int high=a.length-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if((a[mid]==1) && (mid==0 || a[mid-1]==1)){
				return (int)mid;
			}
			else if(a[mid]==0){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	} 
}