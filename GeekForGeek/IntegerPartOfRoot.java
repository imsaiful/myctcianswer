/*1. Find integer part of sqrt of given number. Initially I gave o(root(n)) solution. Later solved with binary search(O(logn)).*/

class IntegerPartOfRoot{
	public static void main(String[] args) {
		int n=121;
		System.out.println(help(n));
	}
	public static void help(int n){
		int f=0;
		while(f<n){
			int mid=f+(n-f)/2;
			if(mid*mid==n){
				return mid;
			}
			if(mid*mid>n){
				n=mid-1;
			}
			else{
				l=mid+1;
			}

		}



	}
}