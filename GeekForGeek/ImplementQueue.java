/*Implement Queue using Linked List*/

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}



}


class ImplementQueue{
	Node front=null;
	Node rear=null;
	public static void main(String[] args) {
		ImplementQueue i=new ImplementQueue();
		i.enque(1);
		i.Print();
		i.enque(2);
		i.Print();
		i.enque(3);
		i.Print();
		i.enque(4);
		i.Print();
		i.deque();
		i.Print();
		i.deque();
		i.Print();
		i.enque(5);
		i.Print();
		i.enque(6);
		i.Print();
		i.deque();
		i.Print();
		i.deque();
		i.Print();
		i.deque();
		i.Print();
		i.deque();
		i.Print();
		i.deque();
	}
	public void enque(int d){
		Node temp=new Node(d);
		if(rear==null){
			
			rear=temp;
			front=temp;
		}
		else{
			rear.next=temp;
			rear=temp;
		}
	}
	public void deque(){
		if(front==null){
			System.out.println("Queue empty");
		}
		else{
			front=front.next;
			if(front==null){
				rear=null;
			}
		}
	}
	public void Print(){
		if(front==null){
			System.out.println("No element");
			return;
		}
		Node cur=front;
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}
}