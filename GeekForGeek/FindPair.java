import java.util.*;
class Pair{
	int f;
	int s;
	Pair(int a, int b){
		f=a;
		s=b;
	}
}

class FindPair{
	public static void main(String[] args) {
		int[] a={3, 4, 7, 1, 2, 9, 8};
		FindPair(a);	
	}
	public static void FindPair(int[] a){
		HashMap<Integer,Pair> hm=new HashMap<Integer,Pair>();
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int sum=a[i]+a[j];
				if(hm.containsKey(sum)){
					Pair p=hm.get(sum);
					System.out.println(a[p.f]+" "+a[p.s]+" "+a[i]+" "+a[j]);
					break;
				}
				else{
					hm.put(sum,new Pair(i,j));
				}
			}
		}




	}
}