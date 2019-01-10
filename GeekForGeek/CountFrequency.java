class CountFrequency{
	public static void main(String[] args) {
		String s="geeksforgeeks";
		int[] count=new int[26];
		for(int i=0;i<s.length();i++){
			//System.out.println(s.charAt(i)-'a');
			count[s.charAt(i)-'a']++;
		}

		for(int i=0;i<s.length();i++){
			if(count[s.charAt(i)-'a']!=0){
				System.out.print(s.charAt(i)+""+count[s.charAt(i)-'a']+", ");
				count[s.charAt(i)-'a']=0;
			}
		}

	}


}