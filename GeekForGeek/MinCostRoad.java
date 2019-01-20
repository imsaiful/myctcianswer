/*Q-2 Given N ropes of lengths L1, L2, L3, L4, …, LN. I had to join every rope to get a final rope of length L1 + L2 + … + LN.
However, I can join only two ropes at a time and the cost of joining the two ropes is L1 + L2. I was supposed to join ropes in such a way that the cost is minimum.*/
import java.util.*;
class MinCostRoad{
	public static void main(String[] args) {
		int[] a={4, 3, 2, 6};
		Arrays.sort(a);
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<a.length;i++){
			pq.add(a[i]);
		}
		int result=0;
		while(pq.size()>1){
			int temp=pq.poll()+pq.poll();
			result+=temp;
			pq.add(temp);
		}
		System.out.println(result);

	}
}