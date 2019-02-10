/*Count Possible Decodings of a given Digit Sequence
Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number of possible decodings of the given digit sequence.
Examples:

Input:  digits[] = "121"
Output: 3
// The possible decodings are "ABA", "AU", "LA"

Input: digits[] = "1234"
Output: 3
// The possible decodings are "ABCD", "LCD", "AWD"
An empty digit sequence is considered to have one decoding. It may be assumed that the input contains valid digits from 0 to 9 and there are no leading 0’s, no extra trailing 0’s and no two or more consecutive 0’s.

Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
This problem is recursive and can be broken in sub-problems. We start from end of the given digit sequence. We initialize the total count of decodings as 0. We recur for two subproblems.
1) If the last digit is non-zero, recur for remaining (n-1) digits and add the result to total count.
2) If the last two digits form a valid character (or smaller than 27), recur for remaining (n-2) digits and add the result to total count.

Following is the implementation of the above approach.*/

class DecodeString{
	public static void main(String[] args) {
		String s="1234";
		int n=s.length();
		int temp[]=new int[n+1];
		temp[0]=1;
		temp[1]=1;
		for(int i=2;i<=n;i++){
			temp[i]=0;
			if(s.charAt(i-1)>'0'){
				temp[i]=temp[i-1];
			}
			if(s.charAt(i-2)=='1' || s.charAt(i-2)=='2' && s.charAt(i-1)<'7'){
				temp[i]+=temp[i-2];
			}
		}
		System.out.println(temp[n]);
	}
}