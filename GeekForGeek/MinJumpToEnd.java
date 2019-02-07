/*Given a 1D array where each cell represents a toll gate ticket value. Find the minimum number of tickets needed to surpass the whole array (means till u reach the end of array) .
If ticket value is 1 then u can pass that cell alone. If ticket value is 2 u can pass that cell and the next cell.. that is how ticket values work.
Eg : Input : 3 1 5 4 1 1 1 Output :In this case if v buy ticket from a[0] and a[2] meaning two tickets are enof to pass this array..*/
import java.util.*;
class MinJumpToEnd{
	public static void main(String[] args) {
		int[] a={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int[] min=new int[a.length];
		Arrays.fill(min,Integer.MAX_VALUE-1);
		min[0]=0;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<i;j++){
				int d=i-j;
				if(a[j]>=d){
					min[i]=Math.min(min[i],min[j]+1);
				}

			}
		}
		System.out.println(min[a.length-1]);
	}
}