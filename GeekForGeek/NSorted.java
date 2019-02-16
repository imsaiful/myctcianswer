/*n sorted array*/
import java.util.*;
class NSorted{
	public static void main(String[] args) {
		int[] a={2,6,3,12,56,8};
		help(a,2);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}

	public static void help(int[] a,int k){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

		for(int i=0;i<=k;i++){
			pq.add(a[i]);
		}
		int index=0;
		int n=a.length;
		for(int i=k+1;i<n;i++){
			a[index++]=pq.poll(); 
			pq.add(a[i]);
		}
		while(!pq.isEmpty()){
			a[index++]=pq.poll();
		}
	}
	




}