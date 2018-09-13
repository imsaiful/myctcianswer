import java.util.*;
class NumberMax{
	public static void main(String[] args) {
		int a[]={1,2,27,15};
		int b[]={4,12,19,23,127,235};
		int result=find_min(a,b);
		System.out.println(result);
	}
	public static int find_min(int[] a,int[] b){
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0;
		int d=Integer.MAX_VALUE;
		while(i<a.length && j<b.length){
			if(Math.abs(a[i]-b[j])<d){
				d=Math.abs(a[i]-b[j]);
			}
			if(a[i]<b[j]){
				i++;
			}
			else if(b[j]<a[i]){
				j++;
			}
			else{
				break;
			}
		}
		return d;
	}
}