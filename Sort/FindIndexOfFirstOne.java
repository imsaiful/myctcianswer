/*Given a infinite string of O’s and 1’s respectively. You need to find the transition point from 0 to 1.*/

class FindIndexOfFirstOne{
	public static void main(String[] args) {
		int[] a = {0, 0, 0, 0, 1, 1};
		System.out.println(help(a,0,a.length-1));
	}
	public static int help(int[] a, int low,int high){
		if(high<low){
			return -1;
		}
		while(low<=high){
			int mid=low+(high-low)/2;
			if(a[mid]==0){
				low=mid+1;
			}
			if(a[mid]==1){
				if(a[mid-1]==0){
					return mid;
				}
				else{
					high=mid-1;
				}
			}
		}
		return -1;
	}
} 