import java.util.*;
class SortStack{
	public static Stack<Integer> Sort(Stack<Integer> st){
		Stack<Integer> temp=new Stack<Integer>();
		while(!st.isEmpty()){
			int x=st.pop();
			while(!temp.isEmpty() && temp.peek()<x){
				st.push(temp.pop());
			}
			temp.push(x);
		}
		return temp;
	}
	public static void main(String[] args){
		Stack<Integer> st=new Stack<Integer>();
		st.push(9);
		st.push(7);
		st.push(5);
		st.push(11);
		st.push(4);
		st.push(3);
		st.push(1);
		Stack<Integer> sst=Sort(st);
		while(!sst.isEmpty()){
			System.out.println(sst.pop());
		}


	}





}