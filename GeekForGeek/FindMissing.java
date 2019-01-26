/*Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.*/

class FindMissing{
	public static void main(String[] args) {
		int[] a={1, 2, 4,6, 3, 7, 8};
		int n=a.length;
		/*int sum=(n)*(n+1)/2;
		for(int i=0;i<a.length;i++){
			sum-=a[i];
		}
		System.out.println(sum);
*/		int xor1=a[0];
		for(int i=1;i<n;i++){
			xor1^=a[i];
		}
		int xor2=1;
		for(int i=2;i<=n+1;i++){
			xor2^=i;
		}
		System.out.println(xor1^xor2);



	}


}