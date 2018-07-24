class OneWay{
	public static void main(String[] args){
		String s1="pale";
		String s2="bale";
		String s3="bal";
		boolean flag1=opr(s1,s2);
		boolean flag2=opr(s2,s3);
		System.out.print(flag1+"  "+flag2);
	}
	public static boolean opr(String s1,String s2){
		if(Math.abs(s1.length()-s2.length())>1){
			return false;
		}
		String a=s1.length()>s2.length()?s1:s2;
		String b=s1.length()>s2.length()?s2:s1;
		int index1=0,index2=0;
		boolean flag=false;
		while(index1<a.length() && index2<s2.length()){
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(flag){
					return false;
				}
				flag=true;
				if(s1.length()==s2.length()){
				index2++;
			}
			}
			else{
				index2++;
			}
			index1++;
		}
		return true;
	}
}