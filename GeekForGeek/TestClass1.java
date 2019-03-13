/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.*;
import java.util.*;
class TestClass1 {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        // Reading input from STDIN
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            String[] temp=s.trim().split(" ");
            int[] a=new int[n];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(temp[i]);
                max=Math.max(max,a[i]);
            }
            int[] f=new int[Integer.MAX_VALUE-1];
            f[0]=0;
            f[1]=1;
            for(int i=2;i<2*max;i++){
                f[i]=f[i-1]+f[i-2];
            }
            int ans = 0;
            for(int i=0;i<a.length;i++){ 
                for(int j=0;j<a.length;j++){
                    for(int k=0;k<a.length;k++){
                        ans+=f[a[i]+a[j]-a[k]];
                    
                    }
                }
            }
            System.out.println(ans%1000000007);
        }

    }
}
