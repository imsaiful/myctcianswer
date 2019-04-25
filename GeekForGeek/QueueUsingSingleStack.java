import java.util.*;
class QueueUsingSingleStack{
	static Stack<Integer> st;
	QueueUsingSingleStack(){
		st=new Stack<Integer>();
	}

	public void enque(int x){
		st.push(x);
	}
	public void deque(){
		if(!st.isEmpty()){
			if(st.size()==1){
				System.out.println(st.pop());
				return;
			}
			int x=st.pop();
			deque();
			enque(x);
		}
		return;
	}


	public static void main(String[] args) {
		QueueUsingSingleStack qs=new QueueUsingSingleStack();

		qs.enque(1);
		System.out.println(Arrays.toString(st.toArray()));
		qs.enque(2);
		System.out.println(Arrays.toString(st.toArray()));
		qs.enque(3);
		System.out.println(Arrays.toString(st.toArray()));
		qs.enque(4);
		System.out.println(Arrays.toString(st.toArray()));
		qs.enque(5);
		System.out.println(Arrays.toString(st.toArray()));
		qs.deque();
		System.out.println(Arrays.toString(st.toArray()));
		qs.deque();
		System.out.println(Arrays.toString(st.toArray()));



	}
}