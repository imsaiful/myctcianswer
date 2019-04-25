/*Print all possible strings of length k that can be formed from a set of n characters*/

class PrintAllSetOfCharArray{
	public static void main(String[] args) {
		char[] c={'s','a','i','f','u','l'};
		help(c);
	}


	public static void help(char[] c){
		int n=c.length;
		help(c,n,"",4);
	}
	public static void help(char[] c,int n,String prefix,int k){
		if(k==0){
			System.out.println(prefix);
			return;
		}
		for(int i=0;i<n;i++){
			help(c,n,prefix+c[i],k-1);
		}
	}
}