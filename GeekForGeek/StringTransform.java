class StringTransform{
	public static void main(String[] args) {
		String A = "EACBD", B = "EABCD";
		System.out.println(help(A,B));
	}
	public static int help(String A,String B){
		if(A.length()!=B.length()){
			return -1;
		}
		int r=0;
		int[] temp=new int[128];
		for(int i=0;i<A.length();i++){
			temp[A.charAt(i)]++;
			temp[B.charAt(i)]--;
		}

		int i=A.length()-1;
		int j=B.length()-1;
		int res=0;
		while(i>=0){
			if(A.charAt(i)!=B.charAt(j)){
				r++;
			}
			else{
				j--;
			}
			i--;
		}
		return r;




	}


}