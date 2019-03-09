/*Print all distinct permutations of a given string with duplicates
Given a string that may contain duplicates, write a function to print all permutations of given string such that no permutation is repeated in output.
Examples:

Input:  str[] = "AB"
Output: AB BA

Input:  str[] = "AA"
Output: AA

Input:  str[] = "ABC"
Output: ABC ACB BAC BCA CBA CAB

Input:  str[] = "ABA"
Output: ABA AAB BAA

Input:  str[] = "ABCA"
Output: AABC AACB ABAC ABCA ACBA ACAB BAAC BACA 
        BCAA CABA CAAB CBAA*/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        String s=in.next();
	        char[] c=s.toCharArray();
	        Arrays.sort(c);
	        String text = String.valueOf(c);
	        permute(text,"");
	        System.out.println();


	    }
	 }
	 
    public static void permute(String s,String prefix){
        int n=s.length();
		if(n==0){
		
				System.out.print(prefix+" ");
				return;
			
		}
		else{
		    for(int i=0;i<n;i++){
			permute(s.substring(0,i)+s.substring(i+1,n),prefix+s.charAt(i));
		}  
		}  
   }
	 
}