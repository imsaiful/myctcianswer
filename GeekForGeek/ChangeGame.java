import java.util.*;
class ChangeGame{
	public static void main(String[] args) {
		int n=20;
		perform_operation(n);
	}
	public static void perform_operation(int n){
		int[] dp=new int[n+1];
		Arrays.fill(dp,0);
		dp[0]=1;
		for(int i=3;i<=n;i++){
			dp[i]+=dp[i-3];
		}
		for(int i=5;i<=n;i++){
			dp[i]+=dp[i-5];
		}
		for(int i=10;i<=n;i++){
			dp[i]+=dp[i-10];
		}
		System.out.println(dp[n]);
	}
}