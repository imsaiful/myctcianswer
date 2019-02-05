/*Check if a string is substring of another*/

class CheckSubString{
	public static void main(String[] args) {
			String s1="geeksforgeeks";
			String s2="for";
			int[] lps=new int[s2.length()];
			ComputeLMP(s2,lps);
			System.out.println(help(s1,s2,lps));
		}
		public static int help(String s1,String s2,int[] lps){
			int m=s1.length();
			int n=s2.length();
			int i=0;
			int j=0;
			while(i<m){
				if(s1.charAt(i)==s2.charAt(j)){
					i++;
					j++;
				}
				if(j==n){
					//System.out.println("Sub STring found at "+i+1);
					return i-j;
				}
				else if(i<m && s1.charAt(i)!=s2.charAt(j)){
					if(j!=0){
						j=lps[j-1];
					}
					else{
						i++;
					}
				}
			}
			return -1;
		}

		public static void ComputeLMP(String s2,int[] lps){
			int n=s2.length();
			int j=0;
			int i=1;
			lps[0]=0;
			while(i<n){
				if(s2.charAt(i)==s2.charAt(j)){
					j++;
					lps[i]=j;
					i++;
				}
				else{
					if(j!=0){
						j=lps[j-1];
					}
					else{
						lps[i]=j;
						i++;
					}
				}
			}
		}
}