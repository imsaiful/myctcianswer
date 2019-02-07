/*Given 2 sorted linked list , merge them into single sorted list. Change the pointers, don't copy data. (same as merge part of mergesort on SLL)*/

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

class MergeList{
	public static void main(String[] args) {
		Node head=null,tail=null;
		for(int i=1;i<10;i+=2){
			Node temp=new Node(i);
			if(head!=null){
				tail.next=temp;
				tail=temp;
			}
			else{
				head=temp;
				tail=temp;
			}
		}
		Node head2=null,tail2=null;
		for(int i=2;i<10;i+=2){
			Node temp=new Node(i);
			if(head2!=null){
				tail2.next=temp;
				tail2=temp;
			}
			else{
				head2=temp;
				tail2=temp;
			}
		}	
		Print(head);
		Print(head2);
		Node m=Merge(head,head2);
		Print(m);
	}
	public static void Print(Node n){
		while(n!=null){
			System.out.print(n.data+"  ");
			n=n.next;
		}
		System.out.println();
	}
	public static Node Merge(Node n1, Node n2){
		Node dummy=new Node(0);
		Node t=dummy;
		while(n1!=null && n2!=null){
			if(n1.data<n2.data){
				t.next=n1;
				n1=n1.next;
			}
			else{
				t.next=n2;
				n2=n2.next;
			}
			t=t.next;
		}
		if(n1!=null){
			t.next=n1;
		}
		if(n2!=null){
			t.next=n2;
		}
		return dummy.next;




	}



}


