/*Tribonacci Numbers*/
import java.util.*;
class TribonacciNumber{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(help(n));
    }
    public static int help(int n){
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n-1];
    }
}