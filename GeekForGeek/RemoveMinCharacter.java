/*Remove minimum number of characters so that two strings become anagram*/


class RemoveMinCharacter{
	public static void main(String[] args) {
		String s1="bca";
		String s2="acb";
		System.out.println(help(s1,s2));
	}
	public static int help(String s1,String s2){
		int[] temp=new int[256];
		int r=0;
		for(int i=0;i<s1.length();i++){
			temp[s1.charAt(i)]+=1;
		}
		for(int i=0;i<s2.length();i++){
			temp[s2.charAt(i)]-=1;
		}
		for(int i=97;i<123;i++){
			r+=temp[i];
		}
		return r;
	}
}