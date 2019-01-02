class AsciAverage{
	public static void main(String[] args) {
		String s="geeks";
		int avg=0;
		for(int i=0;i<s.length();i++){
			avg+=(int)s.charAt(i);
		}
		System.out.println(avg/s.length());
	}



}