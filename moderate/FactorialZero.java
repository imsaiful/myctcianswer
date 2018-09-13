class FactorialZero{
	public static void main(String[] args){
		int n=10;
		int ans=trainilingZero(n);
		System.out.println(ans);
	}

	public static int trainilingZero(int x){
		if(x<0){
			return -1;
		}
		int count=0;
		for(int i=5;x/i>0;i*=5){
			count+=x/i;
		}

		return count;
	}
}