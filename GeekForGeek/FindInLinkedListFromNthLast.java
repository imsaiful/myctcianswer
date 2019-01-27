/*How to find the last nth element from singly link list, its was very easy for me.
Solved in 2 min and wrote the code quickly.*/
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class FindInLinkedListFromNthLast{


	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(1);
		n.next.next=new Node(2);
		n.next.next.next=new Node(3);
		n.next.next.next.next=new Node(4);
		n.next.next.next.next.next=new Node(5);
		n.next.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next.next=new Node(7);
		n.next.next.next.next.next.next.next.next=new Node(8);
		System.out.println(Find(n,3));
	}
	public static int Find(Node n,int k){
		Node ptr1=n;
		Node ptr2=n;
		for(int i=0;i<=k;i++){
			ptr1=ptr1.next;
		}
		while(ptr1!=null){
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		return ptr2.data;



	}
}