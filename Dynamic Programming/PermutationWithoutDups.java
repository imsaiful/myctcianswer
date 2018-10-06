import java.util.*;
class PermutationWithoutDups{
	public static void main(String[] args) {
		String s="ADBC";
		//PermutationWithoutDups pd=new PermutationWithoutDups();
		Find_Permutation_without_dup(s);
	}
	public static void Find_Permutation_without_dup(String s){
		char input[]=s.toCharArray();
		Map<Character,Integer> coutmap=new TreeMap<Character,Integer>();
		for(char ch:input){

			coutmap.compute(ch,(key,val) -> {
				if(val==null){
					return 1;
				}
				else
				{
					return val+1;
				}


			});
		}

		int[] count=new int[coutmap.size()];
		char[] str=new char[coutmap.size()];
		int index=0;
		for(Map.Entry<Character,Integer> entry:coutmap.entrySet()){
			str[index]=entry.getKey();
			count[index]=entry.getValue();
			index++;
		}
		char[] result=new char[input.length];
		Find_Permutation(str,count,result,0);
	}
	public static void Find_Permutation(char[] str,int[] count,char[] result,int level){
		if(level==result.length){
			for(char ch:result){
				System.out.print(ch);
			}
			System.out.println();
			return;
		}
		for(int i=0;i<str.length;i++){
			if(count[i]==0){
				continue;
			}
			result[level]=str[i];
			count[i]--;
			Find_Permutation(str,count,result,level+1);
			count[i]++;

		}
	}
}