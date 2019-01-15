class ConvertDectoHex{
	public static void main(String[] args) {
		int x=116;
		char[] c=new char[String.valueOf(x).length()];
		System.out.println(c.length);
		int index=0;
		while(x!=0){
			int temp=x%16;
			if(temp<10){
				c[index++]=(char)(temp+48);
			}
			else{
				c[index++]=(char)(temp+55);	
			}
			x=x/16;
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(c[i]);
		}



	}
}