class FindAllDev{
    public static void main(String[] args) {
            int n=3292937;
            for(int i=2;i<100000;i++){
                if(isPrime(i)){
                    if(n%i==0){
                        System.out.println(i);
                    }
                }
            }
    }
    public static boolean isPrime(int n){
        int i=2;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;




    }



}