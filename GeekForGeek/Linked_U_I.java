class Linked_U_I{
	class LinkNode{
		int data;
		LinkNode next;
		LinkNode(int d){
			this.d=d;
		}
	}
	public static void push(LinkNode head,int d){
		LinkNode temp=new LinkNode(d);
		temp.next=head;
		head=temp;
	}
	public static void print(LinkNode head){
		LinkNode l=head;
		while(l!=null){
			System.out.println(l.data+"->");
			l1=l1.next;
		}
	}
	public static void main(String[] args) {
		LinkNode l1=new LinkNode();
		push(l1,2);
		push(l1,4);
		push(l1,6);
		push(l1,8);
		push(l1,0);

		LinkNode l2=new LinkNode();
		push(l2,1);
		push(l2,3);
		push(l2,5);
		push(l2,7);
		push(l2,9);

		print(l1);
		print(l2);
	}
}