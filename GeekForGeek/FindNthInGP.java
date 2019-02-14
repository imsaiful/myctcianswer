/*Write a code to print the nth element of the given series
1 1 2 4 8 16 32*/

class FindNthInGP{
	public static void main(String[] args) {
		int[] ar={1,2,4,8,16,32};

		int a=ar[0];
		int r=ar[1]/ar[0];
		int[] n={4,5,6,7,8,188};
		for(int i=0;i<n.length;i++){
			System.out.println(a*(int)Math.pow(r,n[i]-1));
		}	
	}
}