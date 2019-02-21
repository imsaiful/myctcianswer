/* Write a code to swap adjacent elements in a linked list (both iteratively and recursively).
Input: 1 2 3 4 5
Output: 2 1 4 3 5*/

class Node{
	int d;
	Node next;
	Node(int d){
		this.d=d;
		next=null;
	}
}


class SwapNodeUlternate{
	public static void main(String[] args) {
		Node n=new Node(1);	
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		Print(n);
		Node swap=Swap(n);
		Print(swap);
	}
	public static void Print(Node n){
		while(n!=null){
			System.out.print(n.d+" ");
			n=n.next;
		}
		System.out.println();
	}
	public static Node Swap(Node head){ 

		if(head==null &&  head.next==null){
			return head;
		}

		Node cur=head.next.next;
		Node prev=head;
		head=head.next;
		head.next=prev;
		while(cur!=null && cur.next!=null){
			prev.next=cur.next;
			prev=cur;
			Node next=cur.next.next;
			cur.next.next=cur;
			cur=next;
		}
		prev.next=cur;
		return head;
	}
}