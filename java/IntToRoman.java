/*Integer to roman*/



class IntToRoman{
	public static void main(String[] args) {
		int n=1879;
		System.out.println(help(n));
	}
	public static void help(int n){
		String[] t={"","M","MM","MMM"};
		String[] h={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] d={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] s={"","I","II","III","IV","V","VI","VII","VIII","IX"};

		int n1=t[n/1000];
		int n2=t[(n%1000)/100];
		int n2=t[(n%100)/10];
		int n2=t[(n%10)];
		return n1+n2+n3+n4;


	}







}