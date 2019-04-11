import java.util.*;
import java.io.*;
import java.math.BigInteger; 
class Solution{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
        //ahmad.umar2008@yahoo.in
		String ac="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Index=1;
		while (Index <= t) {
        String[] fl=br.readLine().trim().split(" ");
        int i;
        int n=Integer.parseInt(fl[0]);
        int l=Integer.parseInt(fl[1]);
 
        BigInteger[] a = new BigInteger[l];
        String[] sl=br.readLine().trim().split(" ");    
        for(i=0;i<l;i++)
           a[i]=new BigInteger(sl[i]);
 
        BigInteger[] b=new BigInteger[l];
 
        for(i=0;i<l-1;i++)
        b[i]=a[i].gcd(a[i+1]); 
 
        BigInteger[] opr=new BigInteger[l+1];
 
        for(i=0;i<l-1;i++)
        opr[i]=a[i].divide(b[i]);
 
        opr[l-1]=b[l-2];
        opr[l]=a[l-1].divide(opr[l-1]);
 
        List<BigInteger> al = new ArrayList<BigInteger>();
 
        for(i=0;i<=l;i++)
        	al.add(opr[i]);
 
        Collections.sort(al);
 
        Integer tmp[]=new Integer[l+1];
 
        i=0;
        int j=0;
 
        while(i<=l)
        {
          while(i<l && al.get(i).equals(al.get(i+1)))
          { 
            tmp[i]=j;	
          	i++;
          }
          tmp[i]=j;
          i++;
          j++;
        }
 
        StringBuilder sb=new StringBuilder();
 
         for(i=0;i<=l;i++)
         {
          for(j=0;j<=l;j++)
          	if(opr[i].equals(al.get(j)))
          		break;
 
           sb.append(ac.charAt(tmp[j]));
         }
         System.out.println("Case #" + Index +": " + sb);
		 Index++;
		
		}
	
	}
}
