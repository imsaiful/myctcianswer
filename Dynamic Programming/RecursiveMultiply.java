import java.util.*;
class RecursiveMultiply{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		if(m>n){
			int temp=m;
			m=n;
			n=m;		}
		System.out.println(multipilication(m,n));
	}
	public static int multipilication(int smaller,int bigger){
		if(smaller==0){
			return 0;
		}
		else if(smaller==1){
			return bigger;
		}
		int s=smaller>>1;
		int halfProd=multipilication(s,bigger);
		if(smaller%2==0){
			return halfProd+halfProd;
		}


		return halfProd+halfProd+bigger;
	



	}



}