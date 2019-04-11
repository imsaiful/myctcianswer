import java.util.*;
import java.lang.*;
import java.io.*;
class StockBuyGFG
 {
     
     static class Event{
         int s;
         int e;
         Event(int s,int e){
             this.s=s;
             this.e=e;
         }
     }
	public static void main (String[] args) throws IOException
	 {
	   // Scanner in=new Scanner(System.in);
	   // int t=in.nextInt();
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine()); 
         while(t-->0){
           int m=Integer.parseInt(br.readLine());
           int[] a=new int[m];
           String[] fl=br.readLine().trim().split(" ");
           for(int i=0;i<m;i++){
               a[i]=Integer.parseInt(fl[i]);
           }
           ArrayList<Event> al=new ArrayList<Event>();
           int i=0;
           int n=a.length;
           int flag=0;
           while(i<n-1){
               while((i < n - 1) && a[i+1]<=a[i]){
                   i++;
                   System.out.println(i);
               }
             

               if(i==n-1){
                   break;
               }
               int x=i+1;
               i=i+1;
               while(i<n && a[i]>=a[i-1]){
                   i++;
               }
               int y=i-1;
               Event e=new Event(x,y);
              al.add(e);
               flag++;

           }
           if(flag==0){
               System.out.print("No Profit");
           }
           else{
               for(int j=0;j<al.size();j++){
                   System.out.print("("+al.get(j).s+" "+al.get(j).e+")");
               }
           }
            
            
            
        }
        
	    
	 
	 
	 
	 }
}