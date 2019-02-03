class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
class SwapNode{
	static Node head;
	public static void main(String[] args) {
		SwapNode sn=new SwapNode();
		sn.head=new Node(1);
		sn.head.next=new Node(2);
		sn.head.next.next=new Node(3);
		sn.head.next.next.next=new Node(4);
		sn.head.next.next.next.next=new Node(5);
		sn.head.next.next.next.next.next=new Node(6);
		sn.head.next.next.next.next.next.next=new Node(7);
		sn.head.next.next.next.next.next.next.next=new Node(8);
		sn.head.next.next.next.next.next.next.next.next=new Node(9);
		help(head);
		Print(head);
	}
	public static void help(Node head){
		Node n=head;
		while(n!=null && n.next!=null){
			int temp=n.data;
			n.data=n.next.data;
			n.next.data=temp;
			n=n.next.next;
		}
	}
	public static void Print(Node n){
		while(n!=null && n.next!=null){
			int d=n.data;
			n.data=n.next.data;
			n.next.data=d;
			n=n.next.next;
		}
	}
}