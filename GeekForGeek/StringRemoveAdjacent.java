/*

• Write a code to remove adjacent same alphabets from a string such that in resultant string no two characters are same.
Input: “abccbdccc”
Output: adc



*/

import java.util.*;
class StringRemoveAdjacent{
	public static void main(String[] args) {
		String s="abccbdccc";
		System.out.println(s);			
		System.out.println(help(s));	
	}
	public static String help(String s){
		Stack<Character> st=new Stack<Character>();
		st.push(s.charAt(0));
		for(int i=1;i<s.length();i++){
			if(!st.isEmpty() && s.charAt(i)==st.peek()){
				st.pop();
			}
			else{
				st.push(s.charAt(i));
			}
		}
		String str="";
		while(!st.isEmpty()){
			str=st.peek()+str;
			st.pop();
		}
		return str;




	}
}