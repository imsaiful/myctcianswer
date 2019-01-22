/*Given a infinite stream of integers, find the first non-repeated number till now. Write code for this.*/
import java.util.*;
class FirstNonRepeated{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashSet<Integer> hs=new HashSet<Integer>();
		int flag=0;
		while(true){
			int x=in.nextInt();
			if(hs.contains(x)){
				flag++;
			}
			else{
				hs.add(x);
			}
			System.out.println("First Non repeated"+hs.get(flag));


		}	



	}
}