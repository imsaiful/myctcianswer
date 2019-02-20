/*Reverse an int*/


class ReverseAnInt{
	public static void main(String[] args) {
		int n=1234;
		System.out.println(help(n));
	}
	public static int help(int n){
		int r=0;
		while(n>0){
			int temp=n%10;
			r=r*10+temp;
			n=n/10;
		}
		return r;
	}
}