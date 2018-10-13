import java.io.*; 
import java.util.*;
class CheckBits{
	public static void main(String[] args) {
		Scanner in=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		System.out.println("ENter the number");
		int n=in.nextInt();
		System.out.println(check_validate(n));
		
	}
	public static String check_validate(int n){
		if(n==0){
			return "No";
		}
		while(n>0){
			if((n&1)==0){
				return "No";
			}
			n=n>>1;
		}
		return "YES";
	}
}