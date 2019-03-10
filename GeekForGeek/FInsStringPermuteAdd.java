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
class FInsStringPermuteAdd {
    static boolean flag;
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());               // Reading input from STDIN
        while(t-->0){
            flag=false;
            String s=br.readLine();
            String[] temp=s.trim().split(" ");
            
            String num1=temp[1];
            String num2=temp[2];
            int sum=Integer.parseInt(temp[3]);
            HashSet<Integer> hs=new HashSet<Integer>();

            permute(num1,"",hs); 
            permute(num2,"",hs,sum);
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
    public static void permute(String s,String prefix,HashSet<Integer> hs){
        int n=s.length();
		if(n==0){
			hs.add(Integer.parseInt(prefix));
			return;
        }
		else{
		    for(int i=0;i<n;i++){
			permute(s.substring(0,i)+s.substring(i+1,n),prefix+s.charAt(i),hs);
    		}
        }
    }
     public static void permute(String s,String prefix,HashSet<Integer> hs,int sum){
        int n=s.length();
        if(n==0){
            int x=sum-Integer.parseInt(prefix);
            if(hs.contains(sum-Integer.parseInt(prefix))){
                flag=true;
                return ;
            }
        }
        else{
            for(int i=0;i<n;i++){
            permute(s.substring(0,i)+s.substring(i+1,n),prefix+s.charAt(i),hs,sum);
            }
        }
    }

}
