import java.util.*;
class PrintParenthesis{
	public static void main(String[] args){
		int n=300;
		char[] str=new char[n*2];
		ArrayList<String> al=new ArrayList<String>();
		check_valid(n,str);

	}
	public static void check_valid(int n,char[] str){
		ArrayList<String> al=new ArrayList<String>();
		if(n>0){
			 al=print_valid(al,n,n,str,0);
		}
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}


	}
	public static ArrayList<String> print_valid(ArrayList<String> al,int lp,int rp,char[] str,int pos){
		
		if(lp<0 || rp<lp){
			return null;
		}
		if(lp==0 && rp==0){
			String s=String.copyValueOf(str);
			al.add(s);
		}
		else{
			if(lp>0){
				str[pos]='{';
				print_valid(al,lp-1,rp,str,pos+1);
			}
			if(rp>lp){
				str[pos]='}';
				print_valid(al,lp,rp-1,str,pos+1);
			}
		}
		return al;
	}
}