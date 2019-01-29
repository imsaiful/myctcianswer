/*2.) Given few sets of intervals print out the the entire intervals without overlapping, if they overlap then combine them into one.
Sample test case:

Input :    (5,7) (1 , 6) (2 ,4) (10 ,14) (8,9) 
Output :   (1,7) (8,9) (10,14) */

import java.util.*;
class Point{
	int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}

}

class OverLapInterval{
	public static void main(String[] args) {
		ArrayList<Point> al=new ArrayList<Point>();
		al.add(new Point(5,7));
		al.add(new Point(1,6));
		al.add(new Point(2,4));
		al.add(new Point(10,14));
		al.add(new Point(8,9));

		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i).x+" "+al.get(i).y);
		}
		System.out.println();
		Collections.sort(al, new Comparator<Point>(){
			public int compare(Point a,Point b){
				if(a.x!=b.x){
					return a.x-b.x;
				}
				else{
					return a.y-b.y;
				}
		}});

		Point prev=al.get(0);
		ArrayList<Point> res=new ArrayList<Point>();
		for(int i=1;i<al.size();i++){
			if(prev.y<al.get(i).x){
				res.add(prev);
				prev=al.get(i);
			}
			else{
				Point p=new Point(prev.x,Math.max(al.get(i).y,prev.y));
				prev=p;
			}
		}
		res.add(prev);



		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i).x+" "+res.get(i).y);
		}

	}



}