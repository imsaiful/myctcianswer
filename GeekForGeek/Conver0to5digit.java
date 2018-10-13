class Conver0to5digit{
	public static void main(String[] args) {
		int n=0000000;
		if(n==0){
			System.out.println("5");
		}
		else{
			System.out.println(Conversion(n));
		}
	}
	public static int Conversion(int n){
		/*if(n==0){
			return 0;
		}
		int digit=n%10;
		if(digit==0){
			digit=5;
		}
		return Conversion(n/10)*10+digit;*/
		return Integer.parseInt(Integer.toString(n).replace('0','5'));
	}
}