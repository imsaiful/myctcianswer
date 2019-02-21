/*Lexicographically smallest and largest substring of size k*/


class LexicographicallyString{
	public static void main(String[] args) {
		String s="welcometojava";
		help(s,3);	
	}
	public static void help(String s,int n){
		String cs=s.substring(0,n);
		String min=cs;
		String max=cs;
		for(int i=n;i<s.length();i++){
			cs=cs.substring(1,n)+s.charAt(i);
			if(max.compareTo(cs)<0){
				max=cs;
			}
			if(min.compareTo(cs)>0){
				min=cs;
			}
		}
		System.out.println(min+"  "+max);
  
	}
}