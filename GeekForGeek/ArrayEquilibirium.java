class ArrayEquilibirium{
	public static void main(String[] args) {
		
		int[] a={-7, 1, 5, 2, -4, 3, 0};
		int ind=Find_index(a);
		System.out.println(ind);

	}
	public static int Find_index(int[] a){
		int sum=0;
		int left_sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}

		for(int i=0;i<a.length;i++){
			sum-=a[i];
			
			if(sum==left_sum){
				return i+1;
			}
			left_sum+=a[i];
		}
		return -1;
		




	}




}