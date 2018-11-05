class AllPrime{
	public static void main(String[] args) {
		int n=49;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(isPrime(i)){
				System.out.print(i*i+" ");
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