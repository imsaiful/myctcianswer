//practice
import java.util.*;
class MinHip{
	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		for(int j=0;j<10;j++){
			pq.add(1);
		}

		int k=5;
		while(k>1){
			pq.poll();
			k--;
		}
		System.out.println(pq.peek());

	}


}