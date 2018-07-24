import java.util.*;
class AnagramSort{
	public static void main(String[] args){
		String a[]={"tab","car","god","abt","dog","rac","bat"};
		GroupAnagram(a);

	}

	public static void GroupAnagram(String[] a){
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		for(String str:a){
			String s=sort(str);
			if(hm.containsKey(s)){

				ArrayList<String> al=hm.get(s);
				al.add(str);
			}
			else{

				ArrayList<String> al=new ArrayList<String>();
				al.add(str);
				hm.put(s,al);
				
			}
		}
		for(String str:hm.keySet()){
			ArrayList<String> al=hm.get(str);
			if(al!=null){
				for(String sal:al){
					System.out.print(sal+" ");
				}
			}


		}
	}

	public static String sort(String s){
		char c[]=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}