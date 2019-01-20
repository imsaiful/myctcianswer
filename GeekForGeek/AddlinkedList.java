/*Q-4 There are two linked lists. Both linked lists have a single-digit number in their nodes. I needed to
treat this linked lists as a numbers and add them up and store the digits in a new linked list.
E.g., head -> 5 -> 6 -> 7-> 9
head -> 2-> 1 -> 1
Resultant linked list: head-> 5 -> 8-> 9-> 0 (5679 + 211 = 5890)*/
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

class AddlinkedList{
	static Node node1,node2;
	public static void main(String[] args) {
		node1=new Node(5);
		node1.next=new Node(6);
		node1.next.next=new Node(7);
		node1.next.next.next=new Node(9);

		node2=new Node(2);
		node2.next=new Node(1);
		node2.next.next=new Node(1);

		help(node1,node2);
	}

	public static void help(Node n1,Node n2)
	{
		
		Node m1=reverse(n1);
		Node m2=reverse(n2);
		Node head=null;
		int c=0;
		while(m1!=null || m2!=null){
			if(m1!=null){
				c+=m1.data;
				m1=m1.next;
			}
			if(m2!=null){
				c+=m2.data;
				m2=m2.next;
			}

			Node temp=new Node(c%10);
			temp.next=head;
			head=temp;
			c=c/10;
		}
		Print(head);
	}

	public static Node reverse(Node A){
		Node cur=A;		
		Node prev=null;
		while(cur!=null){
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}

	public static void Print(Node head){
		Node cur=head;
		while(cur!=null){
			System.out.print(cur.data+"->");
			cur=cur.next;
		}
		System.out.print("null");
	}
}