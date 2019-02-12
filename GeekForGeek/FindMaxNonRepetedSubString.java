/*Length of the longest substring without repeating characters
Given a string, find the length of the longest substring without repeating characters. For example, the longest substrings without repeating characters for “ABDEFGABEF” are “BDEFGA” and “DEFGAB”, with length 6. For “BBBB” the longest substring is “B”, with length 1. For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7.





The desired time complexity is O(n) where n is the length of the string.*/

import java.util.*;
class FindMaxNonRepetedSubString{
	public static void main(String[] args) {
		String str="“GEEKSFORGEEKS”";
		int s=0;
		int e=0;
		int start=0;
		int end=0;
		int max=0;
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(!hs.contains(c)){
				hs.add(c);
				e++;
				if(e-s>max){
					max=e-s;
					start=s;
					end=e;
				}
			}
			else{
				hs.remove(str.charAt(s));
				s++;
				i--;
			}
		}	
		
		System.out.println(str.substring(start,end));
	}
}