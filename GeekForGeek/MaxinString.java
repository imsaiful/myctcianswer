/*Question 1:You have been given an alphanumeric string extract maximum numeric value from that
Input: 100klh564abc365bg
Output: 564  */

class MaxinString{
	public static void main(String[] args) {
		String s="100klh5646487q6abc36578939bg";
		int max=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				sb.append(s.charAt(i));
			}
			else{
					if(sb.length()!=0)
					{
						int temp=Integer.parseInt(sb.toString());
						if(temp>max)
							{
								max=temp;
							}
						sb=new StringBuilder();
					}
			}
		}
		System.out.println(max);
	}
}