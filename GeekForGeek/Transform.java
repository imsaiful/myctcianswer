class Transform{
	public static void main(String[] args) {
		String A = "ABC", B = "ABD";
		System.out.print(help(A,B));
	}
	public static int help(String s1,String s2){
		if(s1.length()!=s2.length()){
			return -1;
		}
		int[] a=new int[256];
		for(int i=0;i<s1.length();i++){
			a[s1.charAt(i)]++;
			a[s2.charAt(i)]--;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				return -1;
			}
		}
		int m=s1.length()-1;
		int n=s2.length()-1;
		int flag=0;
		while(m>=0){
			if(s1.charAt(m)!=s2.charAt(n)){
				flag++;
			}else{
				n--;
			}
			m--;
		}
		return flag;
	} 
}