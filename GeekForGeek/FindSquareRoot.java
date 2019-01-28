/*finding the square root of a number without using library functions*/
class FindSquareRoot{
	public static void main(String[] args) {
		System.out.println(SquareRoot(121));
	}
	public static int SquareRoot(int x){
		if(x<=1){
			return 1;
		}
		int start=1,end=x;
		while(start<=end){

			int mid=start+(end-start)/2;
			System.out.println(mid+"  ");
			if(mid*mid==x){
				return mid;
			}
			else if(mid*mid>x){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return -1;
	}
}