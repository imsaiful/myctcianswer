/*
2. In a string detect the smallest window length with highest number of distinct characters. For eg.
A = “aabcbcdbca”, then ans would be 4 as of “dbca”

*/

class MainWindowAllCharacterSubSTring{
    public static void main(String[] args) {
        String s="aabcbcdbca";
        System.out.println(help(s));   
    }   
    public static String help(String s){
        int dc=count(s);
        int sw=Integer.MAX_VALUE;
        int si=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(count(s.substring(i,j))==dc){
                    int temp=j-i;
                    if(temp<sw){
                        sw=temp;
                        si=i;
                    }
                }
            }
        }
    
        return s.substring(si,si+sw);
    } 
    public static int count(String s){
        boolean[] flag=new boolean[26];
        int dc=0;
        for(int i=0;i<s.length();i++){
           
            if(!flag[s.charAt(i)-'a']){
                dc++;
                flag[s.charAt(i)-'a']=true;
            }
        }
        return dc;
    }
}