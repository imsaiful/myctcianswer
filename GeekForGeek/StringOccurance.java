/*Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] and its permutations (or anagrams) in txt[]. You may assume that n > m. 
Expected time complexity is O(n)

Examples:

1) Input:  txt[] = "BACDGABCDA"  pat[] = "ABCD"
   Output:   Found at Index 0
             Found at Index 5
             Found at Index 6
2) Input: txt[] =  "AAABABAA" pat[] = "AABA"
   Output:   Found at Index 0
             Found at Index 1
             Found at Index 4*/

class StringOccurance{

	public static void main(String[] args) {
		String s1="BACDGABCDA";
		String s2="ABCD";
		System.out.println(help(s1,s2));
	}

	public static int help(String s1,String s2){
		int flag=0;
		int m=s1.length();
		int n=s2.length();
		int[] temp=new int[256];
		for(int i=0;i<n;i++){
			temp[(int)s2.charAt(i)]++;
			
		} 
		for(int i=0;i<m-n-1;i++){
			//System.out.println(s1.substring(i,i+n));
			if(anagram(s1.substring(i,i+n),temp)){
				flag++;
			}
		}
		return flag;
	}

	public static boolean anagram(String s,int[] p){
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			
			p[(int)s.charAt(i)]--;
		}

		for(int i=0;i<p.length;i++){
			//System.out.print(s.charAt(i)+"==");
			System.out.print(p[s.charAt(i)]);
			if(p[s.charAt(i)]!=0){
				return false;
			}
		}
		return true;
	}

}