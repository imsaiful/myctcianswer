/*Implement Stack using Linked List*/
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}


class ImplementStackByLinkList{
	static Node head=null;
	public static void main(String[] args) {
			ImplementStackByLinkList i=new ImplementStackByLinkList();
			i.push(1);
			i.push(2);
			i.push(3);
			i.push(4);
			i.push(5);
			i.pop();
			i.pop();
			Print();
			i.pop();
			i.pop();
			i.pop();
			i.pop();
	}
	public void push(int d){
		Node temp=new Node(d);
		if(head==null){
			head=temp;
		}
		else{
			temp.next=head;
			head=temp;
		}
	}
	public static void pop(){
		if(head==null){
			System.out.println("Stack is Empty");
		}
		else{
			System.out.println("ELement Pop:"+head.data);
			head=head.next;
		}
	}
	public static void Print(){
		Node cur=head;
		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}



	}




}