/*perm_identity
Check if binary representation of a number is palindrome*/
class CheckBinaryPalindrome{
	public static void main(String[] args) {
		int n=7;
		String s="1000101";
		String r=reverse(s);
		System.out.println(r);
		System.out.println(FindPalindrome(s,r));
	}
	public static boolean FindPalindrome(String s,String r){
		 return s.equals(r);
	}
	static String reverse(String c){
         return new StringBuilder(c).reverse().toString();
     }
}