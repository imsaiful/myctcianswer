/*Word Break Problem*/
import java.util.*;
class WordBreak{
	public static void main(String[] args) {
		String s="iamgoodboy";
		String[] d={"i","am","good","bad","boy","software"};
		help(s,d);
	}

	public static void help(String s,String[] dict){
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<dict.length;i++){
			hs.add(dict[i]);
		}

		boolean[] dp=new boolean[s.length()+1];
		for(int i=0;i<s.length();i++){
			for(int j=i;j>=0;j--){
				if(hs.contains(s.substring(j,i+1)) && (j==0 || dp[j-1])){
					dp[i]=true;
					break;
				}
			}
		}
		System.out.println(dp[s.length()-1]);
		if(dp[s.length()-1]){
			int prev=0;
			for(int i=0;i<s.length();i++){
				if(dp[i]){
					System.out.print(s.substring(prev,i+1)+" ");
					prev=i+1;
				}


			}
		}
		else{
					System.out.print("Not Possible");
		}


	}
}