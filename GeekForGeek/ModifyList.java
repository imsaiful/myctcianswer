/*2. Given a linked list modify the linked list as below
I/p: a x b c y z
O/p: a b c x y z*/
class Node{
	char d;
	Node next;
	Node(char d){
		this.d=d;
		next=null;
	}
}


class ModifyList{
	public static void main(String[] args) {
		Node n=new Node('a');
		n.next=new Node('p');
		n.next.next=new Node('b');
		n.next.next.next=new Node('q');
		n.next.next.next.next=new Node('c');
		n.next.next.next.next.next=new Node('r');
		n.next.next.next.next.next.next=new Node('d');
		n.next.next.next.next.next.next.next=new Node('s');
		n.next.next.next.next.next.next.next.next=new Node('e');
		Print(n);
		Modify(n);
		Print(n);
	}
	public static void Print(Node n){
		Node cur=n;
		int k=15;
		while(cur!=null && k-->0){
			System.out.print(cur.d+" ");
			cur=cur.next;
		}
		System.out.println();
	}
	public static void Modify(Node cur){
		Node dummy1=new Node('0');
		Node dummy2=new Node('0');
		Node p1=dummy1;
		Node p2=dummy2;
		boolean flag=true;
		while(cur!=null){
			//System.out.print(cur.d+" ");
			if(flag){
				p1.next=cur;
				p1=cur;
				
				flag=false;
			}
			else{
				p2.next=cur;
				p2=cur;
				
				flag=true;
			}
			cur=cur.next;
		}
		p2.next=null;
		p1.next=dummy2.next;

	}
}