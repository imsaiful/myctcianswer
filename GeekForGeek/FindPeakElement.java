import java.util.*;

class FindPeakElement{
	public static void main(String[] args) {
		int[] a={1, 3, 20, 4, 1, 0}; 
		System.out.println(help(a,0,a.length-1,a.length-1));	
	}
	public static int help(int[] a,int low,int high,int n){
		int mid=low+(high-low)/2;
		if((mid>0 && a[mid-1]<a[mid]) && (a[mid]==n-1 || a[mid]>a[mid+1])){
			return a[mid];
		}
		else if((mid>0 && a[mid-1]>a[mid])){
			return help(a,low,mid-1,n);
		}
		else return help(a,mid+1,high,n);
	}
}