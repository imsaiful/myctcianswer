/*Find subarray with given sum | Set 2 (Handles Negative Numbers)
Given an unsorted array of integers, find a subarray which adds to a given number. If there are more than one subarrays with the sum as the given number, print any of them.

Examples:

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {10, 2, -2, -20, 10}, sum = -10
Ouptut: Sum found between indexes 0 to 3

Input: arr[] = {-10, 0, 2, -2, -20, 10}, sum = 20
Ouptut: No subarray with given sum exists*/
import java.util.*;
class SumInSubArray{
	public static void main(String[] args) {
		int[] a={1,2,-9,4,-6,9,11,-7};
		FinDubArray(a,20);
	}	
	public static void FinDubArray(int[] a,int s){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int cs=0;
		int start=0;
		int end=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			cs+=a[i];
			if(cs-s==0){
				start=0;
				end=i;
				flag=true;
				break;
			}
			if(hm.containsKey(cs-s)){
				start=hm.get(cs-s)+1;
				end=i;
				flag=true;
				break;
			}
			hm.put(cs,i);
		}
		if(flag){
			System.out.println(start+" "+end);
		}
		else{
			System.out.println("No SubArray is exist");
		}
	}
}