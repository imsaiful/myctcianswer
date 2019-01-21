/**
 *
 * NOTE : Class Name should be Main 
 *
 **/
/*import java.io.*;
import java.util.*;
class Main {
    
    static class Ball{
        int cr;
        int wt;
        Ball(int c,int w){
            cr=c;
            wt=w;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=in.nextInt();
        int W=in.nextInt();
        Ball[] b=new Ball[n];
        for(int i=0;i<n;i++){
            b[i]=new Ball(in.nextInt(),in.nextInt());
        }
        Collections.sort(b, new Comparator<Ball>(){
        public int compare(Ball a, Ball b){
            if(a.wt!=b.wt){
                return a.wt-b.wt;
            }
            else
            {
                return a.cr-b.cr;
            }
        }});

        int p=3;
        while(W>0){
            System.out.print(b[p%n].cr);
            W=W-b[p%n].wt;
            p++;
        }
        
    }
}
*/

/**
 *
 * NOTE : Class Name should be Main 
 *
 **/
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws InterruptedException {
       Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       int m=in.nextInt();
       int[] a=new int[m];
       int min=1;
       for(int i=0;i<m;i++){
           a[i]=in.nextInt();
           if(a[i]<min){
            min=a[i];
           }
       }
       int flag=0;
       int n=in.nextInt();
       int b[]=new int[n];
       for(int i=0;i<n;i++){
           b[i]=in.nextInt();
           if(b[i]>min){
               flag++;
           }
       }
       System.out.println(m*3+flag*3);
       
       
       
       
    }
}
































