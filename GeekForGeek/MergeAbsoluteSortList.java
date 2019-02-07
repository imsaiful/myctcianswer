/*There is a linked list which is sorted based on their absolute values. Sort them based on their actual values.
Eg., input : 1 -> -2 -> -3 -> 4 -> -5 output: -5 -> -3 -> -2 -> 1 ->4*/
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}


class MergeAbsoluteSortList{
	static Node head=null;
	static Node prev=null;
	public static void main(String[] args) {
		Push(1);
		Push(-2);
		Push(3);
		Push(4);
		Push(-5);
		Push(6);
		Push(-7);
		Push(-8);
		Print();
		Sort();
		Print();
	}
	public static void Push(int x){
		Node temp=new Node(x);
		if(head==null){
			head=temp;
			prev=temp;
		}
		else{
			prev.next=temp;
			prev=temp;	
		}
	}

	public static void Print(){
		Node cur=head;
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}
	public static void Sort(){
		Node cur=head.next;
		Node prev=head;
		while(cur!=null){
			if(cur.data>=prev.data){
				prev=cur;
			}
			else{
				prev.next=cur.next;
				cur.next=head;
				head=cur;
			}
			cur=prev.next;
		}
	}

}