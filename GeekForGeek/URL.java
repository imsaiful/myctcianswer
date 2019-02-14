class URL{
	public static void main(String[] args) {
		String s="My name is Saiful";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				sb.append('%');
				sb.append('2');
				sb.append('0');
			}
			else{
				sb.append(s.charAt(i));	
			}
		}
		System.out.println(sb.toString());

	}
}