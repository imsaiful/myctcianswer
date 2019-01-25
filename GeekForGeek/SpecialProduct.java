import java.util.*;
public class SpecialProduct {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(5);
        a.add(9);
        a.add(6);
        a.add(8);
        a.add(6);
        a.add(4);
        a.add(6);
        a.add(9);
        a.add(5);
        a.add(4);
        a.add(9);
       System.out.println(maxSpecialProduct(a));

    }


    public static int maxSpecialProduct(ArrayList<Integer> A) {
        int n = A.size();
        if(n==0)
            return 0;
        int left[] = new int[n];
        left[0] = 0;
        for(int i=1;i<n;i++)
        {
            int j = i-1;
            while(j>0){
                if(A.get(i)<A.get(j)){
                    left[i] = j;
                    break;
                }
                j = left[j];
            }
        }
        for(int i=0;i<left.length;i++){
            System.out.print(left[i]+" ");
        }
        System.out.println();
        int right[] = new int[n];
        for(int i=n-2;i>=0;i--)
        {
            int j = i+1;
            while(j>0)
            {
                if(A.get(i)<A.get(j))
                {
                    right[i] = j;
                    break;
                }
                j = right[j];
            }
        }

        for(int i=0;i<right.length;i++){
            System.out.print(right[i]+" ");
        }
        System.out.println();
        long max = 0;
        for(int i=0;i<n;i++)
            max = Math.max((long)left[i]*right[i], max);
        return (int)(max%1000000007);
    } 
}
