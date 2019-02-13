/*Find out if number is power of 2.*/

class PowerOfTwo{
	public static void main(String[] args) {
		System.out.println(help(32));
		System.out.println(help(34));	
	}
	public static boolean help(int x){
		 return (x&(x-1))==0; 
	}
}