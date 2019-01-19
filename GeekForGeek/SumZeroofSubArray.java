;import java.util.*;
class SumZeroofSubArray{
	public static void main(String[] args) {
		int[] a={1, 4, -2, -2, 5, -4, 3};
		System.out.println(help(a));
	}
	public static boolean help(int[] a){
		int sum=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			if(hs.contains(sum)){
				return true;
			}
			else{
				hs.add(sum);
			}
		}
		return false;
	}
}