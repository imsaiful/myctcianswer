/*Given a range [L,R] find the count of numbers having prime number of set bits in their binary representation. [This hint was included in O/P section. Only even numbers should be checked within the L,R range]*/
class CountPrimeBit{
	public static void main(String[] args) {
		int m=6;
		int n=10;
		int count=0;
		for(int i=m;i<=n;i++){
			int bc=Integer.bitCount(i);
			if(isPrime(bc)){
				count++;
			}
		}
		//System.out.println(count);
		
	}
	public static boolean isPrime(int n){
		System.out.println(n);
			if(n<=1){
				return false;
			}
			for(int i=3;i<=Math.sqrt(n);i++){
				if(n%i==0){
					return false;
				}
			}
			return true;


		}	
}