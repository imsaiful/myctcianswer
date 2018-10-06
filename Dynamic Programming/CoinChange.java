
import java.util.*;
class CoinChange{
	public static void main(String[] args){
		int[] coins={1,2};
		int sum=100;
		System.out.println(CoinChangeOpr(sum,coins));
	}

	public static int CoinChangeOpr(int sum,int[] coins){
		int[] ar=new int[sum+1];
		ar[0]=1;
		for(int coin:coins){
			for(int i=1;i<ar.length;i++){
				if(i>=coin){
					ar[i]+=ar[i-coin];
					//System.out.print(ar[i]+" ");
				}


			}
		}
		return ar[sum];


	} 


}