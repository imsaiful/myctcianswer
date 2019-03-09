//subset problem
import java.util.*;
class SubSet{
	public static void main(String[] args) {
		int[] input={1,2,3};
		Arrays.sort(input);
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subset=new ArrayList<Integer>(); 
		help(input,res,subset,0); 	
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}
	public static void help(int[] input,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> subset,int index){
		System.out.println(subset);
		res.add(new ArrayList<Integer>(subset));
		for(int i=index;i<input.length;i++){
			subset.add(input[i]);
			help(input,res,subset,i+1);
			subset.remove(subset.size()-1);
		}
		/*
			if(index==input.length){
				System.out.println(index+" "+input.length);
				res.add(new ArrayList<>(subset));
				return ;
			}
			subset.add(input[index]);
			help(input,res,subset,index+1);
			subset.remove(subset.size()-1);
			help(input,res,subset,index+1);
	
		*/
	}
}