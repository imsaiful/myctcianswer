/*Given an array with +ve and -ve numbers. Give an algorithm to find 3 numbers having sum x in less than O(n3) complexity.
*/
import java.util.*;
class FindTriplePair{
    public static void main(String[] args){
        int[] a={ 1, 4, 45, 6, 10, 8 }; 
        int sum=22;
        Arrays.sort(a);
        for(int i=0;i<a.length-3;i++){
            int j=i+1;
            int k=a.length-1;
            while(j<k){
                int temp=a[i]+a[j]+a[k];
                if(a[i]+a[j]+a[k]==sum){
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    break;
                }   
                if(temp<sum){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }
}