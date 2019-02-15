/*reverse second half linkedlist
example:
even number: 2->1->3->4->5->6->7->8 =====> 2->1->3->4->8->7->6->5 ；

odd number: 5->7->8->6->3->4->2 ======> 5->7->8->2->4->3->6, the middle one also need be reversed*/
class Node{
	int d;
	Node next;
	Node(int d){
		this.d=d;
		next=null;
	}
}
class ReverseHalfList{
	public static void main(String[] args) {
		Node n=new Node(2);
		n.next=new Node(1);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);	
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		
		Print(n);
		ReverseHalfList(n);
		Print(n);
	}
	public static void Print(Node n){
		while(n!=null){
			System.out.print(n.d+"  ");
			n=n.next;
		}
		System.out.println();
	}
	public static void ReverseHalfList(Node n){
		Node slow=n;
		Node fast=n;
		Node prev=null;
		while(fast!=null && fast.next!=null){
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		Node p=null;
		while(slow!=null){
			Node next=slow.next;
			slow.next=p;
			p=slow;
			slow=next;
		}
		prev.next=p;
	}
}