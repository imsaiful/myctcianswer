/* finding the middle element of a linked list*/

class Node{
	int d;
	Node next;
	Node(int d){
		this.d=d;
		next=null;
	}
}

class MidElement{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		
		System.out.println(FindMid(n));
	}
	public static int FindMid(Node n){

		Node slow=n;
		Node fast=n;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}


		return slow.d;





	}


}