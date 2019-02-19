/*iven an array of integers, print pairs(positive value and negative value of the number)  that exists in the array.
    
Input : [1, -3, 2, 3, 6, -1]
Output : [-1,1] 
         [-3,3]*/

import java.util.*;
class PrintPair{
	public static void main(String[] args) {
		int[] a={1, -3, 2, 3, 6, -1};
		help(a);	
	}
	public static void help(int[] a){
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			int x=Math.abs(a[i]);
			if(hs.contains(x)){
				System.out.println(x+",-"+x);
			}
			else{
				hs.add(x);
			}
		}
	}
}