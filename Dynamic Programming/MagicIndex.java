class MagicIndex{
	public static void main(String[] args) {
		int[] a={-10,-5,2,2,2,3,4,7,9,12,13};
		int n=a.length;
		int index=FindIndex(a,0,n-1);
		System.out.println(index);

	}
	public static int FindIndex(int[] a,int low,int high){
		if(low>high){
			return -1;
		}
		int mid=(low+high)/2;
		if(a[mid]==mid){
			return mid;
		}

		int li=Math.min(a[mid],mid);
		int left=FindIndex(a,low,li);
		if(left>=0)
		{
			return left;
		}

		int ri=Math.max(a[mid],mid);
		int right=FindIndex(a,ri,high);
		if(right>=0)
		{
			return right;
		}
		return 0;
	}
	
}