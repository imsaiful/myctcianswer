/*Swap two numbers without using arithmetic operator.*/

class SwapWithouArithmetic{
	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println("a="+a+" b="+b);
		System.out.println("After Swap Operation");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+" b="+b);



	}


}