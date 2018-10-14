class PowerofNum{
	public static void main(String[] args) {
		int n=128;
		System.out.println(power_of(n));
	}
	public static boolean power_of(int num){
		if(num==1){
			return true;
		}
		int m=2;
		while(m<=Math.sqrt(num)){
			int n=2;
			while(n<=Math.sqrt(num)+1){
				int x=(int)Math.pow(m,n);
				if(x==num){
					return true;
				}
				n++;
			}
			m++;
		}
		return false;
	} 
}