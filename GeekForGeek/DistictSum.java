import java.util.*;
class DistictSum{
	public static void main(String[] args) {
		int[] a={1,1,2,3,4,5,6,6,7,7,9,9};
		HashSet<Integer> hs=new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(!hs.contains(a[i])){
				sum+=a[i];
			}
			
				
				hs.add(a[i]);
			
		}
		System.out.println(sum);



	}


}