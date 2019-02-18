/*Find a peak element.*/

class FindPeakElementInArray{
	public static void main(String[] args) {
		int[] a={1, 3, 2, 4, 1, 0}; 
		System.out.println(help(a,0,a.length-1));
	}
	public static int help(int[] a,int low,int high){
		while(low<=high){
			int mid=low+(high-low)/2;
			if((mid==0 || a[mid-1]<=a[mid]) && (mid==a.length-1 || a[mid+1]<=a[mid])){
				return a[mid];
			}
			else if(mid>0 && a[mid]<a[mid-1]){
				high=mid-1;
			}
			else{
			 	low=mid+1;	
			}
		}
		return -1;
	}



}