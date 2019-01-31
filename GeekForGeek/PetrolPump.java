/*perm_identity
Find the first circular tour that visits all petrol pumps
Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.
1. The amount of petrol that every petrol pump has.
2. Distance from that petrol pump to the next petrol pump.

Calculate the first point from where a truck will be able to complete the circle (The truck will stop at each petrol pump and it has infinite capacity). Expected time complexity is O(n). Assume for 1 litre petrol, the truck can go 1 unit of distance.
Queue<Station> {}, {6, 5}, {7, 3} and {4, 5}
For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from where truck can make a circular tour is 2nd petrol pump. Output should be “start = 1” (index of 2nd petrol pump).*/
import java.util.*;

class Station{
	int p;
	int d;
	Station(int p1,int d1){
		p=p1;
		d=d1;
	}
}

class PetrolPump{
	public static void main(String[] args) {
		Queue<Station> q=new LinkedList<Station>();
		q.add(new Station(7,3));
		q.add(new Station(6,5));
		q.add(new Station(4,6));
		q.add(new Station(4,5));
		System.out.println(q);
		int start = 0, passed = 0,  p = 0;
		int n=q.size();
	    while(passed<n) {
	        Station st = q.peek();
	        p += st.p;
	        q.remove();

	        if (p >= st.d) {
	            passed += 1;
	            p -= st.d;
	        } else {
	            start += passed + 1;
	            passed = 0; 
	            p = 0;
	        }
	        q.add(st);
	    }
	    System.out.println(start+1);	
	}


	


}