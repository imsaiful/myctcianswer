import java.util.*;
class SortinN{
	public static void main(String[] args) {
		String s="saifulhasankhan";
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(tm.containsKey(s.charAt(i))){
				tm.put(s.charAt(i),tm.get(s.charAt(i))+1);
			}
			else{
				tm.put(s.charAt(i),1);
			}
		}
		 for(Map.Entry m:tm.entrySet()){
		 	int x=(int)m.getValue();

		 	while(x-->0){
		 		System.out.print(m.getKey()+"");
		 	}
		 	System.out.println();


		 }

	}
}