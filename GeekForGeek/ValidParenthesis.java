import java.util.*;
class ValidParenthesis{
	 public static void main(String[] args) {
	 	String s=")(dkk)() ";
	 	Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				st.push('(');
			}
			else if(s.charAt(i)==')'){
				try{
					st.pop();
				}
				catch(Exception e){
					st.push(')');
					System.out.print(false);
					break;
				}
			}
		}	
		if(st.isEmpty()){
			System.out.print(true);
		}
	 }
}					


