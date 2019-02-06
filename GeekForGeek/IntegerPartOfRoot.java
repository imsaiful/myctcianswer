/*1. Find integer part of sqrt of given number. Initially I gave o(root(n)) solution. Later solved with binary search(O(logn)).*/

class IntegerPartOfRoot{
	public static void main(String[] args) {
		int n=121;
		System.out.println(help(n));
	}
	public static int help(int n){
		int f=0;
		int l=n;
		int ans=-1;
		while(f<=l){
			int mid=f+(l-f)/2;
			if(mid*mid==n){
				return mid;
			}
			if(mid*mid>n){
				l=mid-1;
				ans=mid;
			}
			else{
				f=mid+1;
				ans=mid;
			}
		}
		return ans;
	}
}