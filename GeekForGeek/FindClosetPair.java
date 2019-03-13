/*Find K Closest Points to the Origin*/

import java.util.*;
class Pair{
	int x;
	int y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class FindClosetPair{
	public static void main(String[] args) {
		ArrayList<Pair> p=new ArrayList<Pair>();
		p.add(new Pair(-2,4));
		p.add(new Pair(0,-2));
		p.add(new Pair(-1,0));
		p.add(new Pair(3,5));
		p.add(new Pair(-2,-3));
		p.add(new Pair(3,2));
		TreeMap<Double,ArrayList<Pair>> tm=new TreeMap<Double,ArrayList<Pair>>();
		for(int i=0;i<p.size();i++){
			int x=Math.abs(p.get(i).x);
			int y=Math.abs(p.get(i).y);
			double d=Math.sqrt(x*x+y*y);
			if(tm.containsKey(d)){
				ArrayList<Pair> ap=tm.get(d);
				ap.add(new Pair(p.get(i).x,p.get(i).y));
				tm.put(d,ap);
			}
			else{
				ArrayList<Pair> ap=new ArrayList<Pair>();
				ap.add(new Pair(p.get(i).x,p.get(i).y));
				tm.put(d,ap);
			}
		}
		int k=3;
		for(Map.Entry<Double,ArrayList<Pair>> entry : tm.entrySet()) {
 			 	ArrayList<Pair> ap = entry.getValue();
  				for(int i=0;i<ap.size();i++){
  					if(k>0){
  						System.out.println(ap.get(i).x+","+ap.get(i).y);
  						k--;
  					}
  					else{
  						break;
  					}
  				}
			}		
		}
}