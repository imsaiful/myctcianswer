/*Was asked to write production code for implementing a LinkedHashMap where items when retrieved comes out in the same order as inserted.  An update on already present element makes it as a new element.

Production level code for three functions were asked to implement with every case covered:

add()
delete()
printAll()
Asked me about its Time/Space Complexity.


*/
import java.util.*;
class LinkedHashMap1{
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
	  //LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		hm.put("ABU",10);
		hm.put("Ibrahim",9);
		hm.put("Ismail",7);
		hm.put("MOHAMMAD",8);
		hm.put("MUSA",6);
		hm.put("EISA",2);
		hm.put("TAIMOOR",1);
		hm.remove("Ismail");

		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());


		}
			System.out.print("KeySet="+hm.keySet());  
			System.out.print("KeyValues="+hm.values()); 
			System.out.print("KeyValues="+hm.entrySet());  
		hm.clear();
		System.out.print("Clear the hashmap");
		System.out.print("KeySet="+hm.keySet());  
			System.out.print("KeyValues="+hm.values()); 
			System.out.print("KeyValues="+hm.entrySet());  
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());


		}  


	}


}