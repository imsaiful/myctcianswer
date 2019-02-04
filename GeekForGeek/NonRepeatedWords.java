/*Given an input sentence, output the non repeated words in the sentence.*/
import java.util.*;
class NonRepeatedWords{
	public static void main(String[] args) {
		String str="My name is Saiful Hasan. My father name is Mehomood Hasan. I am a software Engineer at Amazon.";
		String[] s=str.replace('.',' ').split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++){
			if(hm.containsKey(s[i])){
				hm.put(s[i],hm.get(s[i])+1);
			}
			else{
				hm.put(s[i],1);	
			}
		}
		for (Map.Entry<String,Integer> entry : hm.entrySet()) {
 		    if(entry.getValue()==1){
 		    	System.out.println(entry.getKey()+"  "+entry.getValue());
 		    }
		}

	}



}