/*Trending tab related question: Given a large stream of strings, return the top 10 most frequently occurring string . (Hash map + min heap of size 10 is the solution.)*/
import java.util.*;

class FindTop10{
	public static void main(String[] args) {
		


		String p="My name is Saiful Hasan . My dather name is Mahmood Hasan . I am from Rampur. I am software enginner . I did my software engineer from Jamia Millia Islamia and IP Universty in Delhi";
		HashMap<String, Integer> hm=new HashMap<String,Integer>();

		String[] S=p.split(" ");
		for(String s:S ){
			Integer i=hm.get(s);
			if(i==null){
				i=0;
			}
			hm.put(s,++i);
		}
		List<Map.Entry> l=new ArrayList(hm.entrySet());
		Collections.sort(l, new Comparator() {
        public int compare(Object o1, Object o2) {
            Integer v1 = (Integer) ((Map.Entry) o1).getValue();
            Integer v2 = (Integer) ((Map.Entry) o2).getValue();
            return v1.compareTo(v2);
        }
    });

	}



}