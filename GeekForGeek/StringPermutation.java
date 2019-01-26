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
class StringPermutation{
	static HashSet<String> hs=new HashSet<String>();
	public static void main(String[] args) {
		String s="ABC";
		
		permute("",s);
	}
	public static void permute(String prefix,String s){
		int n=s.length();
		if(n==0){
			if(!hs.contains(prefix)){
				System.out.print(prefix+" ");
				hs.add(prefix);
			}
		}
		for(int i=0;i<n;i++){
			permute(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,n));
		}
	}



}