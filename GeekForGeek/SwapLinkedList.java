/*Given a singly linked list, swap every 2 nodes, for odd number of input; retain the last node as it is.*/
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}


class SwapLinkedList{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		n.next.next.next.next.next.next.next=new Node(8);
		n.next.next.next.next.next.next.next.next=new Node(9);
		
		Print(n);
		Node new_node=Swap(n);
		System.out.print("Hello0");
		Print(new_node);
	}
	public static void Print(Node n){
		Node cur=n;
		while(cur!=null){
			System.out.print(cur.data+"=>");
			cur=cur.next;
		}
		System.out.println();

		
		
	}
	public static Node Swap(Node node){
	
		if(node==null || node.next==null){
			return node;
		}

		Node remaining=node.next.next;
		Node newhead=node.next;
		node.next.next=node;
		node.next= Swap(remaining);

		return newhead;
	}
}