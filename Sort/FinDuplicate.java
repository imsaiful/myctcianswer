import java.util.*;
class FinDuplicate{
	public static void main(String[] args){
		int[] a={1,2,3,2,4,5,1,7,8,9,11,13,11,15,11,17,8};
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hs.containsKey(a[i])){
				hs.put(a[i],hs.get(a[i])+1);
			}
			else{
				hs.put(a[i],1);
			}
		}
		for(Integer i:hs.keySet()){
			int x=hs.get(i);
			if(x>1){
				System.out.print(i+" ");
			}


		}





		}
	




}