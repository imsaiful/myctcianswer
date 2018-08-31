class UniqueString
{
	public static void main(String[] args){
		String s="education";
		boolean flag=unique(s);
		System.out.println(flag);
	}


	public static boolean unique(String s){
		boolean[] set=new boolean[127];
		for(int i=0;i<s.length();i++){
			int x=s.charAt(i);
			if(set[x]){
				return false;
			}
			else{
				set[x]=true;
			}
		}


		return true;
	}




}