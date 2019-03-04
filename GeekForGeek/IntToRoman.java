/*Integer to roman*/



class IntToRoman{
	public static void main(String[] args) {
		int n=25;
		System.out.println(help(n));
	}
	public static String help(int n){
		String[] t={"","M","MM","MMM"};
		String[] h={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] d={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] s={"","I","II","III","IV","V","VI","VII","VIII","IX"};

		String n1=t[n/1000];
		String n2=h[(n%1000)/100];
		String n3=d[(n%100)/10];
		String n4=s[(n%10)];
		return n1+n2+n3+n4;


	}

}
