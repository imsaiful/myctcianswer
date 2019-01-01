class BuildLowest{
	public static void main(String[] args) {
		String s="1211189";
		StringBuilder sb=new StringBuilder(s);
		int n=2;

		for(int i=0;i<sb.length()-1;i++){
			if(sb.charAt(i)>sb.charAt(i+1)){
				sb.deleteCharAt(i);
				i--;
				n--;
				if(n<0){
					break;
				}
			}
		}
		while(n>0){
			sb.deleteCharAt(sb.length()-1);
			n--;
		}

		System.out.println(sb);



	}



}