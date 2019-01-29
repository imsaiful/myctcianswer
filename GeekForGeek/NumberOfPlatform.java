/*2.)The arrival and departure time of trains are given. Find the minimum number of platforms to accommodate all the trains.

Eg.		Arrival 	Departure
		7		11
		8		10
		13		14
		4 		6
Output:   2*/
import java.util.*;
class Platform{
	int a,d;
	Platform(int a,int d){
		this.a=a;
		this.d=d;
	}
}
class NumberOfPlatform{
	public static void main(String[] args) {
		ArrayList<Platform> al=new ArrayList<Platform>();
		al.add(new Platform(7,11)); 
		al.add(new Platform(8,10));
		al.add(new Platform(13,14));
		al.add(new Platform(4,6));

		int flag=1;

		Collections.sort(al, new Comparator<Platform>(){
			public int compare(Platform p1,Platform p2){
				if(p1.a!=p2.a){
					return p1.a-p2.a;
				}
				else{
					return p1.d-p2.d;	
				}
			}
		});	


		int i=1;
		int j=0;
		int max=0;
		int n=al.size();
		while(i<n && j<n){
			if(al.get(j).d>al.get(i).a){
				flag++;
				if(flag>max){
					max=flag;
				}
				i++;
			}
			else{
				flag--;
				j++;
			}
		}
		System.out.println(max);
	}
}