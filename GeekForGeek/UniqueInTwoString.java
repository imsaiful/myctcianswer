/*How to print unique alphabet from two strings using Java?*/
import java.util.*;
class UniqueInTwoString{
	public static void main(String[] args) {
		String s1 = "saiful";
		String s2 = "sana";
		HashSet<Character> h1=new HashSet<Character>();
		HashSet<Character> h2=new HashSet<Character>();
		for(int i=0;i<s1.length();i++){
			h1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
			h2.add(s2.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			if(!h2.contains(s1.charAt(i))){
				sb.append(s1.charAt(i));
			}
		}
		for(int i=0;i<s2.length();i++){
			if(!h1.contains(s2.charAt(i))){
				sb.append(s2.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}