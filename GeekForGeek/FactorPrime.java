class javac {
    public static void main(String[] args) {
        int n=3292937;
        for(int i=2;i<n;i++){
            if(isPrime(i) && n%i==0){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    
}