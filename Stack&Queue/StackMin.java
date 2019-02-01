import java.util.*;
class StackMin{
	Stack<Integer> st;
	Stack<Integer> stemp;
	public StackMin(){
		st=new Stack<Integer>();
		stemp=new Stack<Integer>();
	}
	public void Push(int x){
		int temp=Integer.MIN_VALUE;
		if(stemp.isEmpty()){
			stemp.push(x);
		}
		else{
			temp=stemp.peek();
			if(x<temp){
				stemp.push(x);	
			}
		}
		st.push(x);
	}
	public int Pop(){
		int x=st.pop();
		if(!stemp.isEmpty() && x==stemp.peek()){
				stemp.pop();
		}
		return x;
	}
	public int min(){
		if(!stemp.isEmpty()){
			return stemp.peek();	
		}
		return Integer.MIN_VALUE;
		
	}
	public static void main(String[] args){

		Scanner in=new Scanner(System.in);
		Stack<Integer> st=new Stack<Integer>();
		StackMin sm=new StackMin();
		sm.Push(5);
		System.out.println(sm.min());
		sm.Push(6);
		System.out.println(sm.min());
		sm.Push(3);
		System.out.println(sm.min());
		sm.Push(7);
		System.out.println(sm.min());
		sm.Pop();
		System.out.println(sm.min());
		sm.Pop();
		System.out.println(sm.min());
	}
}