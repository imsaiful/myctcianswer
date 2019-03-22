/*Reverse a Linked List in groups of given size | Set 1
Given a linked list, write a function to reverse every k nodes (where k is an input to the function).
Example:
Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3 
Output:  3->2->1->6->5->4->8->7->NULL. 

Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
Output:  5->4->3->2->1->8->7->6->NULL. */
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}


class ReverseLinkedList{
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
        //n.next.next.next.next.next.next=new Node(7);
        Print(n);
        n=ReverseInNthSize(n,3);
        Print(n);
    }  
    public static Node ReverseInNthSize(Node n,int k){
        Node next=null;
        Node cur=n;
        Node prev=null;
        int count=0;
        while(count<k && cur!=null){  
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            
            count++;
        }
        if(next!=null){
            n.next=ReverseInNthSize(next,k);
        }   
        return prev;
    }
    public static void Print(Node n){
        Node cur=n;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}