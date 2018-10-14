import java.io.*;
import java.util.*;

class FlipBit{
	public static void main(String[] args) {
		Scanner in=new Scanner(new BufferedReader(new InputStreamReader(System.in)));	
		while(true){
			int a=in.nextInt();
		int b=in.nextInt();

		System.out.println(Count_bit_to_change(a^b));
		}
	}
	public static int Count_bit_to_change(int n){
		System.out.println(n);
		
		int flag=0;
		while(n!=0){
			flag+=n&1;
			n=n>>1;
		}
		return flag;
	}
}