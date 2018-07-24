class URLify{
	public static void main(String[] args){
		String s="I am Saiful      ";
		String result=Opr(s,11);
		System.out.print(result);
	}
	public static String Opr(String s,int trueLength){
		int count=0;
		for(int i=0;i<trueLength;i++){
			if(s.charAt(i)=' '){
				count++;
			}
		}
		int index=trueLength+2*count;
		char[] temp=s.toCharArray();
		temp[index]='\0';
		for(int i=index-1;i>=0;i--){
			if(temp[i]==' '){
				temp[index-1]='0';
				temp[index-2]='2';
				temp[index-3]='%';
				index=index-3;
			}
			else{
				temp[index-1]=temp[i];
				index--;
			}
		}
		return new String(temp);




	}



}