/*Count Occurences of Anagrams*/

class FindOccurance{
    public static void main(String[] args) {
        String s = "forxxorfxdofr"; 
        String t = "for";
        System.out.println(help(s,t)); 
    }    
    public static int help(String s,String t){
        int count=0;
        int[] f=new int[26];
        int N=s.length();
        int n=t.length();
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
            f[t.charAt(i)-'a']--;
        }
        if(isZeroCount(f)){
            count++;
        }
        for(int i=n;i<N;i++){
            f[s.charAt(i)-'a']++;
            f[s.charAt(i-n)-'a']--;
            if(isZeroCount(f)){
                count++;
            }
        }
         return count;
    }
    public static boolean isZeroCount(int[] f){
        for(int i=0;i<26;i++){
            if(f[i]!=0){
                return false;
            }
        }
        return true;
    }
}