import java.util.*;
class MissingInt{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,7,8,9};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			hm.put(a[i],1);
		}
		for(int i=1;i<a.length;i++){
			
				if(!hm.containsKey(i)){
					System.out.print(i+" ");
				}
			
			
		}



	}



}
