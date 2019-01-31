/*Find the smallest positive number missing from an unsorted array | Set 1
You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array in O(n) time using constant extra space. You can modify the original array.
Examples

 Input:  {2, 3, 7, 6, 8, -1, -10, 15}
 Output: 1

 Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
 Output: 4

 Input: {1, 1, 0, -1, -2}
 Output: 2 */
import java.util.*;
 class FirstMissing{
 	public static void main(String[] args) {
		int[] a={2, 3, 1, 6, 8, -1, -10, 15};
		int max,n;
		max=n=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				n++;
				if(a[i]>max){
					max=a[i];
				}
			}
		}	
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<hs.size();i++){
			hs.add(a[i]);
		}

		for(int i=1;i<max+1;i++){
			if(!hs.contains(i)){
				System.out.print(i+"  ");
				break;
			}
		}
 	}
}