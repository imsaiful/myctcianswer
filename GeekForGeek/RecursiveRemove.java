/*perm_identity
Recursively remove all adjacent duplicates
Given a string, recursively remove adjacent duplicate characters from string. The output string should not have any adjacent duplicates. See following examples.
Input:  azxxzy
Output: ay
First "azxxzy" is reduced to "azzy". 
The string "azzy" contains duplicates, 
so it is further reduced to "ay".

Input: geeksforgeeg
Output: gksfor
First "geeksforgeeg" is reduced to 
"gksforgg". The string "gksforgg" 
contains duplicates, so it is further 
reduced to "gksfor".

Input: caaabbbaacdddd
Output: Empty String

Input: acaaabbbacdddd
Output: acac*/

class RecursiveRemove{
	public static void main(String[] args) {
		String s="acaaabbbacdddd";
		System.out.println(help(s));	
	}

	public static String help(String s){
		StringBuilder sb=new StringBuilder();
		boolean flag=true;
		char prev=s.charAt(0);
		for(int i=1;i<s.length();i++){
			if(prev!=s.charAt(i)){
				if(flag){
					sb.append(prev);
				}
				else{
					flag=true;
				}

			}
			else{
				flag=false;
			}
			if(sb.length()>=2 && sb.charAt(sb.length()-1)==sb.charAt(sb.length()-2))
			{
				sb.deleteCharAt(sb.length()-1);
				sb.deleteCharAt(sb.length()-1);
			}
			prev=s.charAt(i);


		}
		return sb.toString();
	}
}