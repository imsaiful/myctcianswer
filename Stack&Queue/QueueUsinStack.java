import java.util.*;
class QueueUsinStack{
	Stack<Integer> st1;
	Stack<Integer> st2;
	public QueueUsinStack(){
		st1=new Stack<Integer>();
		st2=new Stack<Integer>();
	}
	public void enQueue(int x){
		
			st1.push(x);
		
	}
	public int deQueue(){
		if(st1.isEmpty() && st2.isEmpty()){
			return Integer.MIN_VALUE;
		}
		if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.push(st1.pop());
			}

		}
		return st2.pop();
	}

	public static void main(String[] args){
		QueueUsinStack qs=new QueueUsinStack();
		qs.enQueue(2);
		qs.enQueue(4);
		qs.enQueue(6);
		qs.enQueue(7);
		qs.enQueue(8);
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
	}
}