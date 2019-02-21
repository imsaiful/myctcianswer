/*Given a bench with n seats and few people sitting, tell the seat number each time when a new person goes to sit on the bench such that his distance from others is maximum.*/

import java.util.*;

class Seat{
	int l;
	int r;
	Seat(int l,int r){
		this.l=l;
		this.r=r;
	}
}

class MaxDistanceInBench{
	public static void main(String[] args) {
		int[] a=new int[10];
		Arrays.fill(a,0);
		PriorityQueue<Seat> space=new PriorityQueue<Seat>(new SeatComparator());
		for(int i=0;i<10;i++){
			System.out.println("Seat for candidate :"+getSeat(a,space));
		}
		System.out.println("Remaining Seat");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static int getSeat(int[] a,PriorityQueue<Seat> space){
		if(a[0]==0){
			a[0]=1;
			return 0;
		}
		if(a[a.length-1]==0){
			space.add(new Seat(0,a.length-1));
			a[a.length-1]=1;
			return a.length-1;
		}
		Seat cs=space.poll();
		space.add(new Seat(cs.l,(cs.l+cs.r)/2));
		space.add(new Seat((cs.l+cs.r)/2,cs.r));
		a[(cs.l+cs.r)/2]=1;
		return (cs.l+cs.r)/2;
	} 
	public static class SeatComparator implements Comparator<Seat>{
		public int compare(Seat one, Seat two){
			return Integer.compare(two.r-two.l,one.r-one.l);
		}
	}
}