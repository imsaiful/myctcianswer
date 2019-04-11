import java.util.*;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
 //                        

public class CodeJaMEx {
	public static void main (String args[])
	{
		Scanner in =new Scanner(System.in);
		int t = in.nextInt();
		String word="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
		while (t --> 0) {
		 int i;
         int n=cin.nextInt();
         int size=cin.nextInt();
 
        BigInteger[] input = new BigInteger[l];
 
        for(i=0;i<l;i++){
            a[i]=in.nextBigInteger();
        }
         
 
        BigInteger[] b=new BigInteger[size];
 
        for(i=0;i<size-1;i++){
            b[i]=a[i].gcd(a[i+1]);
        }
         
 
        BigInteger[] num=new BigInteger[size+1];
 
        for(i=0;i<size-1;i++){
            num[i]=a[i].divide(b[i]);
        }
        
 
        num[size-1]=b[size-2];
        num[size]=a[size-1].divide(num[size-1]);
 
        List<BigInteger> arr = new ArrayList<BigInteger>();
 
        for(i=0;i<=size;i++)
        	arr.add(num[i]);
 
        Collections.sort(arr);
 
        Integer tmp[]=new Integer[l+1];
 
        i=0;
        int j=0;
 
        while(i<=l)
        {
          while(i<l && arr.get(i).equals(arr.get(i+1)))
          { 
            tmp[i]=j;	
          	i++;
          }
          tmp[i]=j;
          i++;
          j++;
        }
 
        String ans="";
 
         for(i=0;i<=l;i++)
         {
          for(j=0;j<=l;j++)
          	if(num[i].equals(arr.get(j)))
          		break;
 
           ans+=alpha.charAt(tmp[j]);
         }
         System.out.println("Case #" + cnt +": " + ans);
		 t--;
		 cnt++;
		}
		cin.close();
	}
}
 
