import java.util.*;
class FindLessThanEqual{
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 7, 9}; 
    	int b[] = {0, 1, 2, 1, 1, 4}; 
    	CountELement(a,b);	
	}
	public static void CountELement(int[] a,int[] b){
		Arrays.sort(b);
		for(int i=0;i<a.length;i++){
			int find_index=binary_search(b,a[i])+1;
			System.out.print(find_index+"  ");
		}
	}
	public static int binary_search(int[] b,int e){
		int low=0;
		int high=b.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(b[mid]<=e){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return high;
	}
}