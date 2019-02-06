class SquareRoot{
	public static void main(String[] args) {
		int x=121;
		System.out.print(sqrt(x));
	}
	public static int sqrt(int x){
		int start=0;
		int end=x;
		int ans=0;
		while(start<=end){
			int mid=(start+end)/2;
			
			if(mid*mid==x){
				return mid;
			}
			else if(mid*mid<x){
				start=mid+1;
				ans=mid;
			}
			else{
				end=mid;
			}
		}
		return ans;


	}

}