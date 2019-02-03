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
		
		Print(n);
		Swap(n);
		Print(n);
	}
	public static void Print(Node n){
		while(n.next!=null){
			System.out.print(n.data+"=>");
			n=n.next;
		}
		System.out.println(n.data);
	}
	public static void Swap(Node n){
		while(n!=null && n.next!=null){
			int temp=n.data;
			n.data=n.next.data;
			n.next.data=temp;
			n=n.next.next;
		}
	}
}