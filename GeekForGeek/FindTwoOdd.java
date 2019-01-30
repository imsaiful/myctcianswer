/*Find the two numbers with odd occurrences in an unsorted array
Given an unsorted array that contains even number of occurrences for all numbers except two numbers. Find the two numbers which have odd occurrences in O(n) time complexity and O(1) extra space.
Examples:

Input: {12, 23, 34, 12, 12, 23, 12, 45}
Output: 34 and 45

Input: {4, 4, 100, 5000, 4, 4, 4, 4, 100, 100}
Output: 100 and 5000

Input: {10, 20}
Output: 10 and 20
*/
class FindTwoOdd{
	public static void main(String[] args) {
		int[] a={12, 23, 34, 12, 12, 23, 12, 45};
		help(a);	
	}	
	public static void help(int[] a){
		int xor1=a[0];
		for(int i=1;i<a.length;i++){
			xor1^=a[i];
		}
		System.out.println(xor1);

		int set_bit=xor1 & ~ (xor1-1);

		System.out.println(set_bit); 

		int x=0,y=0;

		for(int i=0;i<a.length;i++){
			if((set_bit&a[i])>0){
				x^=a[i];
			}
			else{
				y^=a[i];
			}
		}
		System.out.println(x+"  "+y);
	}
}