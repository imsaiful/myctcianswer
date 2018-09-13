import java.util.*;
class PermutationDupPrintWithoutDup{
	public static void main(String[] args){
		String s="AABC";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
		
			}
			else {
				hm.put(c,1);
				
			}
		}
		PrintPerm(hm,"",s.length());


	}
	public static void PrintPerm(HashMap<Character,Integer> hm,String prefix,int remaining){
		
		if(remaining==0){
			System.out.println(prefix);
		}
		for(char c:hm.keySet()){
			int count=hm.get(c);
			if(count>0){
				hm.put(c,count-1);
				PrintPerm(hm,prefix+c,remaining-1);
				hm.put(c,count);

			}
		}
	}
}