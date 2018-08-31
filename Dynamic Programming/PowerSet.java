import java.util.*;
class PowerSet{
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1); 
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		ArrayList<ArrayList<Integer>> al=find_power_set(ar);
		//System.out.println(al);

	}
	public static ArrayList<ArrayList<Integer>> find_power_set(ArrayList<Integer> ar){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		int n=1<<ar.size();
		for(int k=0;k<n;k++){
			ArrayList<Integer> subset=find_set(ar,k);
			res.add(subset);
		}
		return res;
	}
	public static ArrayList<Integer> find_set(ArrayList<Integer> ar,int x){
		ArrayList<Integer> subset=new ArrayList<Integer>();
		int index=0;
		System.out.println(k>>=1);
		for(int k=x;k>0;k>>=1){
			
			if((k&1)==1){
				subset.add(ar.get(index));
				
			}
			index++;
		}
		return subset;
	}




}