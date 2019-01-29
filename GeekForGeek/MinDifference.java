//Find minimum difference between any two elements
import java.util.*;
class MinDifference{
	public static void main(String[] args) {
		int a[]={1, 5, 3, 19, 18, 25};
		int n=a.length;
		HashSet<Integer> hs=new HashSet<Integer>();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++){
			min=Math.min(Math.abs(a[i]-a[i+1]),min);
		}
		System.out.println(min);
	}
}