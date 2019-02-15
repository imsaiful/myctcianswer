/*KMP Algorithm*/

class KMPAlgo{
	public static void main(String[] args) {
		String s="mynameissaifulhasan";
		String p="saiful";
		find(s,p);
	}

	public static void find(String s,String p){
		int m=s.length();
		int n=p.length();
		int[] lps=computePattern(p);
		int i=0;
		int j=0;
		while(i<m){
			if(s.charAt(i)==p.charAt(j)){
				i++;
				j++;
				if(j==n){
					System.out.println("pattern matched at "+(i-j));
					System.out.println(s.substring(i-j,i));
					i=m;
					break;
				}
			}
			else{
				if(j!=0){
					j=lps[j-1];
				}
				else{
					i++;
				}
			}
		}
	}
	public static int[] computePattern(String p){
		int n=p.length();
		int[] lps=new int[n+1];
		int i=1;
		int j=0;
		while(i<n){
			if(p.charAt(i)==p.charAt(j)){
				j++;
				lps[i]=j;
				i++;
			}
			else{
				if(j!=0){
					j=lps[i-1];
				}
				else{
					lps[i]=0;
					i++;
				}
			}
		}
		return lps;
	} 
}