class FindMiddle{ 
	ListNode head;
	class ListNode{
		int data;
		ListNode next;
		ListNode(int d){
			data=d;
			next=null;
		}
	}
	public void push(int d){
		ListNode new_node=new ListNode(d);
		new_node.next=head;
		head=new_node;
	}


	public int FinaMid(){
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
	FindMiddle f=new FindMiddle();
	f.push(1);
	f.push(2);
	f.push(3);
	f.push(4);
	f.push(5);
	f.push(6);
	f.push(7);
	System.out.print(f.FinaMid());
	}
}