import java.util.*;
class StockProblem{
	public static void main(String[] args) {
		 int price[] = {10, 4, 5, 90, 120, 80}; 

		 help(price);
	}
	public static void help(int[] p){
		int[] s=new int[p.length];
		Stack<Integer> st=new Stack<Integer>();
		st.push(0);
		s[0]=1;
		for(int i=1;i<p.length;i++){
			while(!st.isEmpty() && p[st.peek()]<p[i]){
				st.pop();
			}
			s[i]=st.isEmpty()?i+1:i-st.peek();
			st.push(i);


		}
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"  ");
		}





	}
}