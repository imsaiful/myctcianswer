/* Increament null pointer */


class Node{
	int data;
	Node(int d){
		data=d;
	}
}
class IncreamentNull{
	public static void main(String[] args) {
		Node n=null;
		Node m=new Node(2);	
		System.out.println(m+" "+n);
		n=2*m;
		System.out.println(m+" "+n);
	}



}