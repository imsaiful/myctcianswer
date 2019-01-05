class ReverseStringWord{
	public static void main(String[] args) {
		String s="My name is X Y Z";
		StringBuilder result=new StringBuilder();
		StringBuilder str=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				result.insert(0,str+" ");
				str.setLength(0);
			}
			else{
				str.append(s.charAt(i));
				if(i==s.length()-1){
					result.insert(0,str+" ");
				}
			}
		}
		System.out.println(result);
	}
}