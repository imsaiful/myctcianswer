import java.util.*;
class HackerrankShipsy{
	public static void main(String[] args){
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(10);
		System.out.println(maximumAmount(a,20));


	}
	public static long maximumAmount(List<Integer> a, long k) {
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(a.size(),Collections.reverseOrder());
        for(int i=0;i<a.size();i++){
        	pq.add(a.get(i));
        }

        while(k>0){
        	int x=pq.poll();
        	ans+=x;
        	if(x==0){
        		break;
        	}
        	pq.add(x-1);
        	k--;

        }
        return ans;
    }



}