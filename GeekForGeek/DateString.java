class DateString{
	public static void main(String[] args) {
		String str = "UN was established on 24-10-1945.India got freedom on 15-08-1947.";
		String s="";
		int c=0;
		int flag=0;
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				s+=str.charAt(i);
				c++;
				if(c==4){
					flag++;
				}
			}
			else if(str.charAt(i)=='-'){
				c=0;
			}
			else{
				s="";
			}
		}
		System.out.println(flag);
	}
}