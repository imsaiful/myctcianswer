/*
Find a range in array of bits(0 and 1) such that by flipping it, the count of 1’s in complete array becomes maximum.

*/

class FlipBitToMakeMax1{
	public static void main(String[] args) {
		int[] a={1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		int wr=0;
		int wl=0;
		int max=0;
		int index=0;
		int count=0;
		while(wr<a.length){
			if(count<=2){
				if(a[wr]==0){
					count++;
				}
				wr++;
			}

			if(count>2){
				if(a[wl]==0){
					count--;
				}
				wl++;
			}
			if(wr-wl>max){
				max=wr-wl;
				index=wl;
			}
		}
		for(int i=index;i<index+max;i++){
			//System.out.println(i+" ");
			if(a[i]==0){
				System.out.println(i+" ");
			}
		}


		//System.out.println(index+"  "+(index+max));
	}
	
}