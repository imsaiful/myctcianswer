/*perm_identity
Find the Rotation Count in Rotated Sorted array
Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k number of times. Given such an array, find the value of k.

Examples:

Input : arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation : Initial array must be {2, 3,
6, 12, 15, 18}. We get the given array after 
rotating the initial array twice.

Input : arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0*/

class FIndRotatedSortPosition{
	public static void main(String[] args) {
		int[] a={10,9,1,2,3,4,5,6,7,8};
		System.out.println(help(a,0,a.length-1));
	}
	public static int help(int[] a,int l, int h){
		if(h<l){
			return -1;
		}
		if(h==l){
			return l;
		}
		int mid=l+(h-l)/2;
		if(mid<h && a[mid+1]<a[mid]){
			return mid+1;
		}
		if(mid>l && a[mid]<a[mid-1]){
			return mid;
		}
		if(a[mid]<a[h]){
			return help(a,l,mid-1);
		}
		return help(a,mid+1,h);
	}
	 


}