import java.util.*;
class NumberOfTriangle{
	public static void main(String[] args) 
	{
		int[] a={10, 21, 22, 100, 101, 200, 300};
		System.out.println(help(a));
	}	
	public static int help(int[] a){
		int n=a.length;
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<n-2;i++){
			int k=i+2;
			for(int j=i+1;j<n-1;j++){
				while(k<n && a[i]+a[j]>a[k]){
					++k;
				}
				count+=k-j-1;
			}
		}
		return count;
		
	}
}