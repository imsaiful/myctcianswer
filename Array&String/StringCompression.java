class StringCompression{
	public static void main(String[] args){
		String s="aabcccccaaa";
		String cs=Compress(s);
		if(s.length()>cs.length()){
			System.out.println(cs);
		}
		else{
			System.out.println(s);
		}
	}
	public static String Compress(String s){
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++){
			count++;
			if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)){

				sb.append(s.charAt(i));
				sb.append(count);
				count=0;
			}
		}
		return new String(sb);
	}




}