/*Sort the stack*/

import java.util.*;
class SortStack{
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(6);
		st.push(5);
		st.push(4);
		
		st.push(8);
		st.push(7);
		
		st.push(3);
		st.push(2);
		st.push(9);
		st=Sort(st);
		while(!st.isEmpty()){
			System.out.print(st.pop()+"  ");
		}


	}
	public static Stack<Integer> Sort(Stack<Integer> st){
		Stack<Integer> temp=new Stack<Integer>();
		while(!st.isEmpty()){
			int x=st.pop();
			while(!temp.isEmpty() && x<temp.peek()){
				st.push(temp.pop());
			}
			temp.push(x);
		}
		return temp;
	}
}