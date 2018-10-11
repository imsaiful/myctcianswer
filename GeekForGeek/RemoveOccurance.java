import java.util.*;
class RemoveOccurance{
	public static void main(String[] args){
		String s="geeksforgeeks";
		char c='e';
		String result=remove_string(s,c);
		System.out.print(result);


	}
	public static String remove_string(String s,char c){
		StringBuilder sb=new StringBuilder(); 
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=c){
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();







	}





}