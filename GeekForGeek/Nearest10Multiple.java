class Nearest10Multiple{
	public static void main(String[] args) {
		int n1=12328;
		int n2=12342;
		help(n1);
		help(n2);
	}
	public static void help(int n){
		int x=n%10;
		if(x<5){
			System.out.println(n-x);
		}
		else{
			x=10-x;
			System.out.println(n+x);	
		}



	}


}