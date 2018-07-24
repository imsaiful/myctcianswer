class RotatedBinarySearch{
	public static void main(String[] args){
		int[] a={10,15,20,25,30,35,40,0,2,4,6};
		int x=Sort(a,4);
		System.out.print(x);
	}
	public static int Sort(int[] a,int b){
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a[mid]==b){
				return mid;
			}
			else if(a[mid]<=a[high]){
				if(a[mid]<b && b<=a[high]){
					low=mid+1;
				}
				else{
					high=mid-1;
				}
			}
			else{
				if(a[low]<=b && b<a[mid]){
					high=mid-1;
				}
				else{
					low=mid+1;
				}
			}
		}
		return -1;
	}
}