/*In a sorted array every number is present twice, only one number is present one time. You have to find the number occurring once. Expected complexity : O(log N)
Ex : 101, 101, 200, 200, 301, 450, 450
Output : 301*/

class NumberInSortedArray{
	public static void main(String[] args) {
		int[] a={101,101, 111, 200, 200, 450, 450};
		System.out.println(help(a,0,a.length-1));
	}
	public static int help(int[] a,int low,int high){
			if(low==high){
				return a[low];
				}
			int mid=low+(high-low)/2;
			if(mid%2==0){
				if(a[mid]==a[mid+1]){
					return help(a,mid+2,high); 
				}
				else{
					return help(a,low,mid-1);
				}
			}
			else{
				if(a[mid]==a[mid-1]){
					return help(a,mid+1,high); 
				}
				else{
					return help(a,low,mid-1);
				}
			}
		}
}