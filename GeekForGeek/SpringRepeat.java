/*1. Given a character string, display the characters that appear more than once in that string.*/

class SpringRepeat{
	public static void main(String[] args) {
		String s="mynameissaifulhasan";
		boolean temp[]=new boolean[256];
		for(int i=0;i<s.length();i++){
			if(temp[s.charAt(i)])
			{
				System.out.print(s.charAt(i)+" ");
			}
			else{
				temp[s.charAt(i)]=true;
			}
		}	
	}
}