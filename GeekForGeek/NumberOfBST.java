/*Count the Number of Binary Search Trees present in a Binary Tree*/
import java.util.*;
class NumberOfBST{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(help(n));
    }
    public static int help(int n){
        int[] dp=new int[n+1];

        dp[0]=1;

        dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];








    }

}