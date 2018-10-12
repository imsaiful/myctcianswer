import java.util.*;
class LeftSmallest{
	public static void main(String[] args) {
		int[] a={1, 6, 4, 10, 2, 5};
		int[] b=new int[a.length];
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<a.length;i++){
			while(!st.isEmpty() && st.peek()>=a[i]){
				st.pop();
			}
		if(st.isEmpty())
		{
			b[i]=-1;
		}
		else {
			b[i]=st.peek();
		}
		st.push(a[i]);

	}
	
	for(int i=0;i<b.length;i++){
		System.out.println(b[i]+" ");
	}
}
	

}