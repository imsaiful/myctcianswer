/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class TechGig {
    public static void main(String args[] ) throws Exception {

    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s1=br.readLine().trim().split(" ");
        int n=Integer.parseInt(s1[0]);
        int k=Integer.parseInt(s1[1]);
        String[] s2=br.readLine().trim().split(" ");
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(10,Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<n;i++){
            pq.add(Integer.parseInt(s2[i]));
        }
        int count=0;
        while(count<k){
            int x=pq.poll();
            sum+=x%1000000009;
            pq.add(x/2);
            count++;
        }
        System.out.println(sum%1000000009);

   }
}
