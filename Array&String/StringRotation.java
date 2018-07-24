class StringRotation{
	public static void main(String[] args){
		String s1="abcdef";
		String s2="efabcd";
		boolean flag=opr(s1,s2);
		System.out.print(flag);
	}
	public static boolean opr(String s1,String s2){
		String s=s1+s1;
		if(s.contains(s2)){
			return true;
		}
		return false;


	}


}