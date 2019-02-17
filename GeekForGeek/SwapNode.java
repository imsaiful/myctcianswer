/* Swap Node in the linkedlist */

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}


class SwapNode{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		Print(n);
		Swap(n,3,4);
		Print(n);
	}

	public static void Print(Node n){
		Node cur=n;
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}

	public static void Swap(Node cur,int n1,int n2){
		Node curX=cur;
		Node prevX=null;
		Node curY=cur;
		Node prevY=null;
		while(curX!=null && curX.data!=n1){
			prevX=curX;
			curX=curX.next;
		}
		while(curY!=null && curY.data!=n2){
			prevY=curY;
			curY=curY.next;
		}


		Node prevX = null, currX = head; 
        while (currX != null && currX.data != x) 
        { 
            prevX = currX; 
            currX = currX.next; 
        } 
  
        // Search for y (keep track of prevY and currY) 
        Node prevY = null, currY = head; 
        while (currY != null && currY.data != y) 
        { 
            prevY = currY; 
            currY = currY.next; 
        } 
  

		if(curX==null || curY==null){
			return;
		}

		if(prevX!=null){
			prevX.next=curY;
		}

		if(prevY!=null){
			prevY.next=curX;
		}

		Node temp=curX.next;
		curX.next=curY.next;
		curY.next=temp;



	}



}