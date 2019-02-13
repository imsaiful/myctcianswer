/*Remove “b” and “ac” from a given string
Given a string, eliminate all “b” and “ac” in the string, you have to replace them in-place, and you are only allowed to iterate over the string once. (Source Google Interview Question)
Examples:

acbac   ==>  ""
aaac    ==>  aa
ababac  ==>   aa
bbbbd   ==>   d*/

class RemoveCharFromString{
	public static void main(String[] args) {
		String s="asdbc";
		System.out.println(help(s.toCharArray()));
	}

	public static String help(char[] c){
		int i=-1;
		int j=0;
		int n=c.length;
		while(j<n){
			if(j<n-1 && c[j]=='b' && c[j+1]=='c'){
				j+=2;
			}
			else if(c[j]=='a'){
				j++;
			}
			else if(i>=0 && c[i]=='a' && c[j]=='c'){
				i--;
				j++;
			}
			else{
				c[++i]=c[j++];
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int k=0;k<c.length;k++){
			sb.append(c[k]);
		}
		return sb.toString().substring(0,i+1);
	}
}