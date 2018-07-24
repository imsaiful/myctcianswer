import java.util.*;
class FindDuplicate{
	public static void main(String[] args){
		int a[]={1,2,34,5,5,6,7,8,9,11,21,21,24,25,26,28,33,31,17,19,7,99,99,8};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i],hm.get(a[i])+1);
			}
			else{
				hm.put(a[i],1);
			}
		}
	for(Integer i:hm.keySet()){
		if(hm.get(i)>1){
			System.out.print(i+" ");
		}


	}
}
}