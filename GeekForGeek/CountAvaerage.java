class CountAvaerage{
    public static void main(String[] args) {
        String str="for";
        System.out.println(help(str));
    }
    public static int help(String s){
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=(int)s.charAt(i);
        }
        return ans/s.length();
    }
}