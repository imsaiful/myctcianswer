/*Longest Common Prefix using Sorting
Problem Statement: Given a set of strings, find the longest common prefix.

Examples:

Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
Output: "gee"

Input: {"apple", "ape", "april"}
Output: "ap"*/
import java.util.*;
class LongestCommonPrefix{
	public static void main(String[] args) {
		String[] a={"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(help(a));	
	}
	public static String help(String[] s){
		int n=s.length;
		if(n==0){
			return " ";
		}
		if(n==1){
			return s[0];
		}
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"  ");
		}
		System.out.println();
		Arrays.sort(s);
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"  ");
		}

		int end=Math.min(s[0].length(),s[n-1].length());
		int i=0;
		while(i<n && s[0].charAt(i)==s[n-1].charAt(i)){
			i++;
		}
		String result=s[0].substring(0,i);
		return result;

	}
}