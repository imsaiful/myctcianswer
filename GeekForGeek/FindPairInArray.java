/*Q1) Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) such that a+b = c+d, and a, b, c and d are distinct elements. If there are multiple answers, then print any of them. Expected complexity :  O(n2

*/
import java.util.*;
class Pair{
	int x,y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class FindPairInArray{
	public static void main(String[] args) {
		int[] a={3,4,7,1,2,9,8};
		HashMap<Integer,Pair> hm=new HashMap<Integer,Pair>(); 
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int x=a[i]+a[j];
				if(hm.containsKey(x)){
					Pair p=hm.get(x);
					System.out.println("("+p.x+","+p.y+"),"+"("+a[i]+","+a[j]+")");
					
				}
				else{
					Pair p=new Pair(a[i],a[j]);
					hm.put(a[i]+a[j],p);
				}
			}


		}	
	}
}