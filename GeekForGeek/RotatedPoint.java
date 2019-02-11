/*Rotated Point in the array which is first increasing and decresing*/
class RotatedPoint{
	public static void main(String[] args) {
		int[] a={10,20,30,40,50,9,8,7};
		System.out.println(help(a,0,a.length-1));	
	}

	public static int help(int[] a,int low,int high){
		while(low<=high){
			if(low==high || high==low+1 && a[low]>a[high]){
				return a[low];
			}
			else if(high==low+1 && a[low]<a[high]){
				return a[high];
			}
			int mid=low+(high-low)/2;
			if(a[mid]>a[mid-1] && a[mid]>a[mid+1]){
				return a[mid];
			}
			if(a[mid]>a[mid+1] && a[mid]<a[mid-1]){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return -1;
	}
	}
