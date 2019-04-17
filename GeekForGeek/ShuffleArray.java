import java.util.*;
class ShuffleArray{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12};
        Random r=new Random();
        for(int i=a.length-1;i>=0;i--){
            int temp=r.nextInt(i);
            int x=a[i];
            a[i]=a[temp];
            a[temp]=x;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }    
}