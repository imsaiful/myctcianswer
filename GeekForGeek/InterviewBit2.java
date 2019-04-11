class InterviewBit2{
    public static void main(String[] args) {
        String s="wvmctuj";
        System.out.println(help(s,28));
    }    
    public static String help(String A,int B){
        StringBuilder sb=new StringBuilder();
        int[] c=new int['z'-'a'+1];
        for(int i=0;i<A.length();i++){
          //  System.out.println(A.charAt(i)-'a');
            c[A.charAt(i)-'a']++; 
             
        }
       
        for(int i=0;i<A.length();i++){
                char ch='a';
                if(c[A.charAt(i)-'a']%2==0){
                    char index=(char)(((int)A.charAt(i)-97+B%26)%26+97);
                    
                    sb.append((index)); 
                }
                else{
                    int index=((int)A.charAt(i)-'a'-B)%26;
                    if(index<0){
                        index+=123;
                    }
                    else{
                        index+=97;
                    }
                   // System.out.println(index+" -i");
                    sb.append((char)(index)); 
                }
                
                
        }
        return sb.toString();


    }


}