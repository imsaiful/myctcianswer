class CountFrequency{
	public static void main(String[] args) {
		String s="geeksforgeeks";
		int[] count=new int[s.length()];
		for(int i=0;i<count.length;count++){
			count[s.charAt(i)-'a']++;
		}

		for(int i==0;i<s.length;i++){
			if(count[s.charAt(i)-'a']!=0){
				System.out.print(count[s.charAt(i)+" "+count[s.charAt(i)-'a']);
				count[s.charAt(i)-'a']=0;
			}
		}

	}


}