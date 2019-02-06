/*Print all possible words from phone digits*/
import java.util.*;
class PhoneDigits{
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"");
		hm.put(2,"abc");
		hm.put(3,"def");
		hm.put(4,"ghi");
		hm.put(5,"jkl");
		hm.put(6,"mno");
		hm.put(7,"pqrs");
		hm.put(8,"tuv");
		hm.put(9,"wxyz");
		hm.put(0,"");
		int[] a={2,3,4};
		help(hm,a,"",a.length-1);
	}
	public static void help(HashMap<Integer,String> hm,int[] a,String res,int index){
		if(index==-1){
			System.out.println(res);
			return;
		}
		int digit=a[index];
		int len=hm.get(digit).length();
		for(int i=0;i<len;i++){
			help(hm,a,hm.get(digit).charAt(i)+res,index-1);
		}



	}
}