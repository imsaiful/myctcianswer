class 2-CheckPermutation{
	public static void main(String[] args){
		String s1="god";
		String s2="don";
		boolean flag=perm(s1,s2);
		System.out.print(flag);
	}
	public static boolean perm(String s1,String s2){
		int[] letter=new int[128];
		for(int i=0;i<s1.length();i++){
			int c=s1.charAt(i);
			letter[c]++;
		}
		for(int i=0;i<s2.length();i++){
			int c=s2.charAt(i);
			letter[c]--;
			if(letter[c]<0){
				return false;
			}
		}
		return true;
		





	}



}