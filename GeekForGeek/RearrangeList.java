/*
Rearrange nodes in the given linked list as follows
    input : a -> b -> c -> d -> e
    output: a -> e -> b -> d -> c*/

class Node{
	char c;
	Node next;
	Node(char c){
		this.c=c;
		next=null;
	}
}

class RearrangeList{
	public static void main(String[] args) {
		Node n=new Node('a');
		n.next=new Node('b');
		n.next.next=new Node('c');
		n.next.next.next=new Node('d');
		n.next.next.next.next=new Node('e');
		help(n);
	}
	public static void help(Node n){
		Node prev=null;
		Node slow=n;
		Node fast=n;
		while(fast!=null && fast.next!=null){
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=null;
		Print(n);
		Print(slow);
		slow=Reverse(slow);
		Node dummy=new Node('0');
		Node temp=dummy;
		while(slow!=null || n!=null){
			if(n!=null){
				temp.next=n;
				temp=n;
				n=n.next;
			}
			if(slow!=null){
				temp.next=slow;
				slow=slow.next;
				temp=temp.next;
			}
		}
		Print(dummy.next);
	}
	public static Node Reverse(Node n){
		Node prev=null;
		while(n!=null){
			Node next=n.next;
			n.next=prev;
			prev=n;
			n=next;
		}
		return prev;
	}
	public static void Print(Node n){
		Node cur=n;
		while(cur!=null){
			System.out.println(cur.c+"  ");
			cur=cur.next;
		}
		System.out.println();
	} 
}