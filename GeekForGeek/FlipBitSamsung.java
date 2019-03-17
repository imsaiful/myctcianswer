/* samsung flip a bit*/

class FlipBitSamsung{
	public static void main(String[] args) {
		int num=34;
		int x=(int)(Math.log(num)/Math.log(2))+1;

		for(int i=0;i<x;i++){
			num=num^(1<<i);
		}
		System.out.println(num);
		



	}


}