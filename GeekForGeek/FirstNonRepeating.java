/*Given a string, find its first non-repeating character*/

import java.util.*;
class FirstNonRepeating{
	public static void main(String[] args) {
		String s="aqizqazpn";
		int[] temp=new int[26];
		Queue<Character> q=new LinkedList<Character>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			q.add(c);
			temp[c-'a']++;
			while(!q.isEmpty()){
				if(temp[q.peek()-'a']>1){
					q.remove();
				}
				else{
					System.out.print(q.peek()+" ");
					break;
				}	
			}
			if(q.isEmpty()){
					System.out.println("-1");
			}
			
		}
	}
}
