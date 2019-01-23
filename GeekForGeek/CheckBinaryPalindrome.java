/*perm_identity
Check if binary representation of a number is palindrome*/
class CheckBinaryPalindrome{
	public static void main(String[] args) {
		int n=9;
		String r=Convert(n);
		System.out.println(help(r));
	}
	public static String Convert(int n){
		String s="";
		while(n!=0){
			int temp=n%2;
			s+=temp;
			n=n/2;
		}
		return s;
	}
	public static boolean help(String s){
		for(int i=0;i<=s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}