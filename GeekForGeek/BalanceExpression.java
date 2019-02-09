
/*Check for balanced parentheses in an expression
Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”*/
import java.util.*;
class BalanceExpression{
	public static void main(String[] args) {
		char[] s={'{','(',')','}','[',']'};
		System.out.println(help(s));
	}
	public static boolean help(char[] s){

			Stack<Character> st=new Stack<Character>();
			for(int i=0;i<s.length;i++){
				if(!st.isEmpty()){
					if(s[i]=='}' && st.peek()!='{'){
					return false;
					}
					else if(s[i]==')' && st.peek()!='('){
						return false;
					}
					else if(s[i]==']' && st.peek()!='['){
						return false;
					}
					
				}
				if(s[i]==')' || s[i]=='}' || s[i]==']'){
						st.pop();
					}
				else{
					st.push(s[i]);
				}
			}
			if(st.isEmpty()){
				return true;
			}
	
	   return false;
		
	}
}