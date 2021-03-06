/*Check if a character link list is palindrome or not.*/

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}


class LinkedListPalindrome{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		Print(n);
		System.out.println();
		Node head=delete(n,3);
		Print(head);
		
	}
	public static Node delete(Node head,int x){
		if(head == null) return head;

		if(head.data > x && head.next == null) return null;

		Node cur = head;
		Node prev = null;

		while(cur != null && cur.data > x) {
		    prev = cur;
		    cur = cur.next;
		}

		if(prev != null) prev.next = null;

		Node newHead = cur;

		while(cur.next != null) {
		    if(cur.next.data > x) {
		        cur.next = cur.next.next;
		    } else {
		        cur = cur.next;
		    }
		}

		return newHead;
	}


	public static void Print(Node n){

		Node cur=n;
		while(cur!=null){
			System.out.print(cur.data+"  ");
			cur=cur.next;
		}

	}
	public static Node Reverse(Node n){
		Node prev= null;
		Node next=null;
		Node cur=n;
		while(cur!=null){
			Node temp=new Node(cur.data);
			temp.next=prev;
			prev=temp;
			cur=cur.next;
		}
		return prev;
	}
	public static boolean isPalindrome(Node n1,Node n2){

		while(n1!=null && n2!=null){
			
			if(n1.data!=n2.data){
				
				return false;
			}
			n1=n1.next;
			n2=n2.next;

		}
		if(n1!=null){
			return false;
		}

		if(n2!=null){
			return false;
		}
		return true;
	}
}