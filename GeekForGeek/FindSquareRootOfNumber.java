/*Find square root of number upto given precision using binary search*/

import java.util.*;
class FindSquareRootOfNumber{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.format("%.3f",help(in.nextInt()));	
		System.out.println();
	}
	public static float help(int n){
		int start=0;
		int end=n;
		float ans=0;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(mid*mid==n){
				return (float)mid;
			}

			if(mid*mid<n){
				start=mid+1;
				ans=mid;
			}
			else{
				end=mid-1;
			}
		}
		float factor=(float)0.1;
		for(int i=0;i<3;i++){
			while(ans*ans<=n){
				ans+=factor;
			}
			ans-=factor;
			factor=factor/10;
		}
		return ans;
		

	}
}