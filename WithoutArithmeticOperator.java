class WithoutArithmeticOperator{
	public static void main(String[] args) {
		int x=19,y=13;
		Add_by_bit(x,y);
		Sub_by_bit(x,y);
		Mul_by_bit(x,y);
	}
	public static void Add_by_bit(int x,int y){
		while(y!=0){
			int carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		System.out.println(x);
	}


	public static void Sub_by_bit(int x,int y){
		while(y!=0){
			int borrow=(~x)&y;
			x=x^y;
			y=borrow<<1;
		}
		System.out.println(x);
	}
	public static void Mul_by_bit(int x,int y){
		int result=0;
		while(y!=0){
			
			if((y&1)!=0){
				result+=x;
			}
			x=x<<1;
			y=y>>1;
		}
		System.out.println(result);
	}
}