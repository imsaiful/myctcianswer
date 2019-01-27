/* Reverse list Node in kth size */

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

class ReverseNodeInKSize{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		n.next.next.next.next.next.next.next=new Node(8);
		n.next.next.next.next.next.next.next.next=new Node(9);
		n.next.next.next.next.next.next.next.next.next=new Node(10);
		n.next.next.next.next.next.next.next.next.next.next=new Node(11);
		Node result=ReverseInGroup(n,3);
		Print(result);
	}

	public static Node ReverseInGroup(Node n,int k){
		Node prev=null;
		Node cur=n;
		int count=0;
		Node next=null;
		while(count<k && cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;
		}
		if(next!=null){
			n.next=ReverseInGroup(next,k);
		}
		return prev;

	}
	public static void Print(Node n){
		Node cur=n;
		while(cur!=null){
			System.out.println(cur.data+"  ");
				cur=cur.next;
		}



	}





}