//Check if a string can be obtained by rotating another string 2 places
class RotateString{
	public static void main(String[] args) {
		String s1="amazon";
		String s2="onamaz";
		boolean ans=check_substring(s1,s2);
		System.out.print(ans);


	}
	public static boolean check_substring(String s1,String s2){
		int l=s2.length();
		String clock_string="";
		clock_string+=s2.substring(l-2,l)+s2.substring(0,l-2);
		if(s1.equals(clock_string)){
			return true;
		}
		String anti_clock_string="";
		anti_clock_string+=s2.substring(2,l)+s2.substring(0,2);
		if(s1.equals(anti_clock_string)){
			return true;
		}
		return false;


	}


}