import java.util.*;
class TripleStep{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("ENter the number of stairs");
		int n=in.nextInt();
		int[] memo=new int[n+1];
		Arrays.fill(memo,-1);
		int ans=StairOpr(n,memo);
		Arrays.fill(memo,-1);
		System.out.println(ans);
	}
	public static int StairOpr(int n,int[] memo){
		if(n<0){
			return 0;
		}
		else if(n==0){
			return 1;
		}
		else if(memo[n]>-1){
			return memo[n];
		}
		else
			memo[n]= StairOpr(n-1,memo)+StairOpr(n-2,memo)+StairOpr(n-3,memo);
			return memo[n];

		





	}





}