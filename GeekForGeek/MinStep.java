import java.util.*;
class MinStep{
    public static void main(String[] args) {
        int n=17;
        System.out.println(help(n));
    }
    public static int help(int n){
        if(n<=1){
            return 0;
        }
        int x=n,y=n,z=n;
        if(n%3==0){
            x=help(n/3);
        }
        if(n%2==0){
            y=help(n/2);
        }
     
            z=help(n-1);
   
        return 1+Math.min(x,Math.min(y,z));





    }


    
}