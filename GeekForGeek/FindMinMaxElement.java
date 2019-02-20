/*Find the element before which all the elements are smaller than it, and after which all are greater
Given an array, find an element before which all elements are smaller than it, and after which all are greater than it. Return index of the element if there is such an element, otherwise return -1.
Examples:

Input:   arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
Output:  Index of element is 4
All elements on left of arr[4] are smaller than it
and all elements on right are greater.
 
Input:   arr[] = {5, 1, 4, 4};
Output:  Index of element is -1
*/


class FindMinMaxElement{
	public static void main(String[] args) {
		int[] a={5, 1, 4, 3, 6, 8, 10, 7, 9};
		int n=a.length;
		int[] lmax=new int[a.length];
		lmax[0]=Integer.MIN_VALUE+1;
		for(int i=1;i<n;i++){
			lmax[i]=Math.max(a[i-1],lmax[i-1]);
		}

		int min=a[n-1];
		for(int i=n-2;i>=0;i--){
			if(a[i]>lmax[i] && a[i]<min){
				System.out.print(i+" ");
				break;
			}
			min=Math.min(min,a[i]);
		}
	}	
}