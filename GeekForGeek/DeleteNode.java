/*Delete key from linked list*/
class Node{
	int d;
	Node next;
	Node(int d){
		this.d=d;
		next=null;
	}
}


class DeleteNode{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		n.next.next.next.next.next.next.next=new Node(8);
		Print(n);
		Delete(n,4);
		Print(n);


	}
	public static void Print(Node n){
		while(n!=null){
			System.out.print(n.d+" ");
			n=n.next;
		}
		System.out.println();
	}
	public static void Delete(Node n,int k){
		if(n.d==k){
			n=n.next;
			return;
		}
		Node prev=null;
		Node cur=n;
		while(cur!=null){
			
			if(cur.d==k){
				break;
			}
			prev=cur;
			cur=cur.next;
		}
		prev.next=prev.next.next;


	}




}