/*Sort an array of 0s, 1s and 2s
Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. The functions should put all 0s first, then all 1s and all 2s in last.
Examples:

Input :  {0, 1, 2, 0, 1, 2}
Output : {0, 0, 1, 1, 2, 2}

Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
*/
class SortInScan{
	public static void main(String[] args) {
		int[] a={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		Sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
	public static void Sort(int[] a){
		int l=0;
		int mid=0;
		int h=a.length-1;
		while(mid<=h){
			if(a[mid]==0){
				int temp=a[l];
				a[l]=a[mid];
				a[mid]=temp;
				l++;
				mid++;
			}
			else if(a[mid]==1){
				mid++;
			}
			else{
				int temp=a[h];
				a[h]=a[mid];
				a[mid]=temp;
				h--;
			}
		}
	}
}