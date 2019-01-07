import java.util.*;
class FingureGame{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print(help(n));
	}
	public static int help(int n){
		int r=n%8;
		if(r==1){
			return 1;
		}
		else if(r==5){
			return 5;
		}
		else if(r==2 || r==0){
			return 2;
		}
		else if(r==3 || r==7){
			return 3;
		}
		
			return 4;
		


	}



}