class Max_sum_no_Adjacent{
	public static void main(String[] args) {
		int[] a= {5, 5, 10, 100, 10, 5}; 
		int incl=a[0];
		int excl=0;
		int excl_new=0;
		for(int i=1;i<a.length;i++){
			excl_new=Math.max(incl,excl);
			incl=excl+a[i];
			excl=Math.max(excl,excl_new);
		}	
		System.out.println(Math.max(incl,excl));



	}
}