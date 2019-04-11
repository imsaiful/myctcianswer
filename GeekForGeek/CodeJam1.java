import java.util.*;
import java.io.*;
class CodeJam1{
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine()); 
    int tc=1;
    while(tc<=t){
     String num=br.readLine();
     int[] input=new int[num.length()];
     for(int i=0;i<num.length();i++){
        input[i]=num.charAt(i)-'0';
     }
     
     ArrayList<Integer> al1=new ArrayList<Integer>();
     ArrayList<Integer> al2=new ArrayList<Integer>();
     al1.add(0);
     al2.add(0);
     for(int i=input.length-1;i>=0;i--){
         if(input[i]<4){
            al1.add(0,input[i]);
            al2.add(0,0);
         }
         else if(input[i]==4){
            al1.add(0,2);
            al2.add(0,2);
         }
         else{
            int x=input[i]-1;
            int y=1;
            while(x==4 || y==4){
                x-=1;
                y+=1;
            }
            al1.add(0,x);
            al2.add(0,y);
         }
     }
     
     while((al2.get(0)==0)&&(al2.size()>0)){
         al2.remove(0);
     }
     System.out.print("Case #"+tc+":"+" ");
     for(int i=0;i<al1.size()-1;i++){
         System.out.print(al1.get(i));
     }
     System.out.print(" ");

     for(int i=0;i<al2.size()-1;i++){
        System.out.print(al2.get(i));
     }
     System.out.println();
     tc++;
    }

    }    
}