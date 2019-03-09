/*
Subsets Submissions: 4466   Accuracy: 28.63%   Difficulty: Medium   Marks: 4
Associated Course(s):   Interview Preparation
            
Given an array of integers that might contain duplicates, return all possible subsets.

Note Output:

        Elements in a subset must be in non-descending order.
        The solution set must not contain duplicate subsets.
        The subsets must be sorted lexicographically.

Example :
If S = [1,2,2], the solution is:

[
[],
[1],
[1,2],
[1,2,2],
[2],
[2, 2]
]


*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors; 
class SubSetProblem
 {
	public static void main (String[] args)
	 {
	     Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int m=in.nextInt();
	        int[] a=new int[m];
	        for(int i=0;i<m;i++){
	            a[i]=in.nextInt();
	        }
	        Arrays.sort(a);
	        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
	        ArrayList<Integer> subset=new ArrayList<Integer>();
	    
	        help(a,result,subset,0);
	        List<ArrayList<Integer>> newList = result.stream() 
                                      .distinct() 
                                      .collect(Collectors.toList()); 
	        for(ArrayList<Integer> temp:newList){
	            System.out.print("(");
	            for(int j=0;j<temp.size();j++){
	                System.out.print(temp.get(j));
	                if(j!=temp.size()-1){
	                    System.out.print(" ");
	                }
	            }
	            System.out.print(")");
	        }
	        System.out.println();
	    }
	 }
	 public static void help(int[] input,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> subset,int index){
            res.add(new ArrayList<Integer>(subset));
		for(int i=index;i<input.length;i++){
			subset.add(input[i]);
			help(input,res,subset,i+1);
			subset.remove(subset.size()-1);
		}
	 }
}