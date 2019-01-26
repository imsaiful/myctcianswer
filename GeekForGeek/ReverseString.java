//Reverse words in a given string

import java.util.regex.Pattern; 

class ReverseString{
	public static void main(String[] args) {
		String str="I love Java Programming";	
		Pattern p=Pattern.compile("\\s"); 
		String[] temp=p.split(str);
		String result="";
		for(int i=0;i<temp.length;i++){
			result=temp[i]+" "+result;
		}
		System.out.println(result);



	}
}
