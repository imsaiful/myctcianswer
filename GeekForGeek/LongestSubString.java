/* Longest Palindromic Substring | Set 1
Given a string, find the longest substring which is palindrome. For example, if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”./*
*/
class LongestSubString{
public static void main(String[] args) {
		String s="forgeeksskeegfor";
		int n=s.length();
		boolean[][] m=new boolean[n+1][n+1];
		for(int i=0;i<n;i++){
			m[i][i]=true;
		}
		int mi=0;
		int index=0;
		for(int i=0;i<n-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				m[i][i+1]=true;
				mi=2;
				index=i;
			}
		}
		for(int k=3;k<=n;k++){
			for(int i=0;i<n-k+1;i++){
				int j=i+k-1;
				if(m[i+1][j-1] && s.charAt(i)==s.charAt(j)){
					m[i][j]=true;
					index=i;
					mi=k;
				}
			}
		}

		System.out.println(s.substring(index,index+mi));




	}	
}