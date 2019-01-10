class MaxSumForNonAdjacentElements{
	public static void main(String[] args) {
		int[] a = {5, 5, 10, 100, 10, 5}; 
		System.out.println(help(a));
	}

	public static int help(int[] a){
		int incl=a[0];
		int temp;
		int excl=0;

		for(int i=1;i<a.length;i++){
			temp=incl;
			incl=Math.max(incl,excl+a[i]);
			excl=temp;
		}
		return incl;
		 



	}


}