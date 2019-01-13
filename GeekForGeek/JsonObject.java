import java.util.*;
class JsonObject{
	public static void main(String[] args) {
		String s = "b) (c) ()";
		int temp=0;
		int flag=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				temp++;
				if(temp>flag){
					flag=temp;
				}
			}
			else if(s.charAt(i)==')'){
				temp--;
			}
		}
		System.out.println(flag);
	}

}