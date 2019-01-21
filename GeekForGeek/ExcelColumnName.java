class ExcelColumnName{
	public static void main(String[] args) {
		int x=705;
		System.out.println(help(x));
	}
	public static String help(int x){
		StringBuilder sb=new StringBuilder();
		while(x>0){
			int rem=x%26;
			if(rem==0){
				sb.append('Z');
				x=x/26-1;
			}
			else{

				sb.append((char)((rem-1)+'A'));
				x=x/26;
			}
		}
		return sb.reverse().toString();
	}
}