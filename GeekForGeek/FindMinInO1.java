/*Find Min in Array in o(1)*/
import java.util.*;
class FindMinInO1{
	 public static void main(String[] args){
	 	int[] a={9,8,2,4,6,4,5,6,1,8,1,11,3};

	 	TreeSet<Integer> ts=new TreeSet<Integer>();
	 	for(int i=0;i<a.length;i++){
	 		ts.add(a[i]);
	 	}
	 	System.out.println(ts.first());



	 }
}