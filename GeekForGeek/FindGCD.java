class FindGCD{
	public static void main(String[] args) {
		int a=98;
		int b=56;
		System.out.println(help(a,b));
	}
	public static int help(int a,int b){
		if(b==0){
			return a;
		}

		return help(b,a%b);
	}
}
		



