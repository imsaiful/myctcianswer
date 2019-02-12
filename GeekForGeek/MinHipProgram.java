//practice
import java.util.*;
class MinHipProgram{
	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		for(int j=0;j<10;j++){
			pq.add(1);
		}

		int k=5;
		while(k>1){
			pq.poll();
			System.out.println(pq.peek());
			k--;
		}
		System.out.println(pq.peek());

	}


}