class StringInNewLine{
    public static void main(String[] args) {
        String str="Its flagship hardware product are the Xbox video game etc.";
        String[] s=str.split(" ");
        int i=0;
        int n=16;
     int cur=0;

            while(i<s.length){
                cur+=s[i].length(); 
                if(cur>16){
                    System.out.println();
                    cur=0;
                    i--;
                }
                else{
                    System.out.print(s[i]+" ");
                   
                }
                i++;
                
                
                if(i==s.length){
                    break;
                } 
            }
           
       



    }
}