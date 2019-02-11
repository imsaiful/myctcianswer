/*Count the number of possible triangles
Given an unsorted array of positive integers. Find the number of triangles that can be formed with three different array elements as three sides of triangles. For a triangle to be possible from 3 values, the sum of any two values (or sides) must be greater than the third value (or third side).
For example, if the input array is {4, 6, 3, 7}, the output should be 3. There are three triangles possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}. Note that {3, 4, 7} is not a possible triangle.
As another example, consider the array {10, 21, 22, 100, 101, 200, 300}. There can be 6 possible triangles: {10, 21, 22}, {21, 100, 101}, {22, 100, 101}, {10, 100, 101}, {100, 101, 200} and {101, 200, 300}*/
import java.util.*;
class FormTriangle{
	public static void main(String[] args) {
		int[] a={10, 21, 22, 100, 101, 200, 300}; 
		System.out.println(help(a));	
	}
	public static int help(int[] a){
		Arrays.sort(a);
		int count=0;
		int n=a.length;
		for(int i=0;i<n-2;i++){
			int k=i+2;
			for(int j=i+1;j<n;j++){
				while(k<n && a[i]+a[j]>a[k]){
					++k;
				}
				if(k>j){
					count+=k-j-1;
				}
			}
		}
		return count;
	}
}