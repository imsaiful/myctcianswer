//Reverse words in a given string

import java.util.regex.Pattern; 

class ReverseString{
	public static void main(String[] args) {
		String s="I love Java Programming";	
		String[] temp=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=temp.length-1;i>=0;i--){
			sb.append(temp[i]+" ");
		}
		System.out.println(sb.toString());



	}
}
