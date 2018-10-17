import java.util.*;
class CheckStringTwice{
	public static void main(String[] args) {
		
	String s[] = { "hate", "love", "peace", "love", 
                       "peace", "hate", "love", "peace", 
                       "love", "peace" }; 
        check_twice_appearance(s);
	}
	public static void check_twice_appearance(String[] s){
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++){
			if(hm.containsKey(s[i])){
				hm.put(s[i],hm.get(s[i])+1);
			}
			else{
				hm.put(s[i],1);	
			}
		}
		int flag=0;
		for(Map.Entry<String , Integer> it:hm.entrySet()){
			if(it.getValue()==2){
				System.out.println(it.getKey());
			}
		} 






	} 


}