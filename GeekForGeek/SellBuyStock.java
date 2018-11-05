//Stock Buy Sell to Maximize Profit
class SellBuyStock{
	public static void main(String[] args) {
		int[] a={100, 180, 260, 310, 40, 535, 695};
		int max=0;
		for(int i=a.length-1;i>0;i--){
			int x=a[i]-a[i-1];
			if(x>0){
				max+=x;
			}
		}	
		System.out.println(max);	
	}
}