class MaxSubString{
	public static void main(String[] args) {
		String str="AABBBCBB";
		int max=1;

		int n=str.length();
		int maxl=n;
		int maxd=Count_distinct(str);
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				String s=str.substring(i,j+1);
				int count=Count_distinct(s);
				if(count==maxd && maxl>s.length()){
					maxl=s.length();
				}
			}
		}
		System.out.println(maxl);
	}
	public static int Count_distinct(String s){
		boolean[] c=new boolean[127];
		int count=0;
		for(int i=0;i<s.length();i++){
			if(!c[s.charAt(i)]){
				count++;
				c[s.charAt(i)]=true;
			}
		}
		return count;
	}
}