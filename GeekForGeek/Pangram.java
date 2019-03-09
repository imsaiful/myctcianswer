class Pangram{
	public static void main(String[] args) {
		String s="a quick brown fox jumps over the lazy dog";
		String s1="a quick brown fox jumps over the la dog";
		System.out.print(help(s));
		System.out.print(help(s1));
	}
	public static int help(String s){
		int[] a=new int[26];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				a[s.charAt(i)-'a']++;	
			}
			
		} 
		for(int i=0;i<26;i++){
			if(a[i]==0){
				return 0;
			}
		}
		return 1;
	}




}