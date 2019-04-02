/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
4
5 3 2 9
4
2 4
1 1 4
2 4
2 3
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestHack {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
       
       int n=in.nextInt();
       ArrayList<TreeSet<Integer>> al=new ArrayList<TreeSet<Integer>>();
       
       
       for(int i=0;i<n;i++){
           TreeSet<Integer> ts=new TreeSet<Integer>();
           ts.add(in.nextInt());
           al.add(ts);
        }
 
        int t=in.nextInt();
        while(t-->0){
            int q=in.nextInt();
            if(q==1){
                int a=in.nextInt()-1;
                int b=in.nextInt()-1;
                TreeSet<Integer> t1=al.get(a);
                TreeSet<Integer> t2=al.get(b);
                Iterator<Integer> v2 = t2.iterator();
                    while (v2.hasNext()) { 
                        t1.add(v2.next());
                         
                    } 
                
                Iterator<Integer> v1 = t1.iterator();
                    while (v1.hasNext()) { 
                        t2.add(v1.next()); 
                    } 
                    al.set(a,t1);
                    al.set(b,t2);
                
            }
            else if(q==2){
                int index=in.nextInt();
                System.out.println(al+" ==");
                TreeSet<Integer> ts=al.get(index-1);
                System.out.println("TreeSet"+ts);
                {
                   
                    System.out.println(ts.last()-ts.first());
                }        
            }
        }
    }
}
