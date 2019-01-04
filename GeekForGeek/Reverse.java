class Reverse{
	public static void main(String[] args) {
		int s=12345;
		int r=0;
		while(s>0){
			r=r*10+s%10;
			s=s/10;
		}
		System.out.println(r);
	}
	


}