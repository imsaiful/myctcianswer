/*Connect n ropes with minimum cost*/

import java.util.*;
class RodJoin{
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int[] a={4, 3, 2, 6};
		for(int i=0;i<a.length;i++){
			pq.add(a[i]);
		}

		while(pq.size()>1){
			int r1=pq.poll();
			int r2=pq.poll();
			pq.add(r1+r2);
		}

		System.out.println(pq.poll());
	}
}