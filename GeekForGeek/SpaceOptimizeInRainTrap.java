class SpaceOptimizeInRainTrap{
	public static void main(String[] args) {
		int[] a={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
		int max=0;
		int li=0;
		int ri=a.length-1;
		int lm=0,rm=0;
		int result=0;
		while(li<=ri){
			if(a[li]<a[ri]){
				if(a[li]>lm){
					lm=a[li];
				}
				else{
					result+=lm-a[li];
				}
				li++;


			}
			else{
				if(a[ri]>rm){
					rm=a[ri];
				}
				else{
					result+=rm-a[ri];
				}
				ri--;
			}
		}	
		System.out.print(result);


	}
}