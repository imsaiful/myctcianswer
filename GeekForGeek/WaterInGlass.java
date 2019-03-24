/*Program to find amount of water in a given glass*/
import java.util.*;
class WaterInGlass{
    public static void main(String[] args) {
        double l=10;
        double c=1;
        int level=0;
       
        double[][] a=new double[(int)l+1][(int)l+1];
        a[level][0]=l;
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<=level;i++){
                if(a[level][i]>c){
                    double r=a[level][i]-c;
                    a[level][i]=c;
                    a[level+1][i]+=r/2;
                    a[level+1][i+1]+=r/2;
                    flag=true;
                   
                }
                
            }
            level++;
        }
        
        System.out.println(a[4-1][4-1]+" ");




    }

    
}
