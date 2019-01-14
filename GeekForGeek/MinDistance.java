class MinDistance{
	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
		System.out.println(help(arr,3,8));
	}

	public static int help(int[] a,int x,int y){
		int i;
		int min=Integer.MAX_VALUE;
		int prev=0;
		for(i=0;i<a.length;i++){
			if(a[i]==x || a[i]==y){
				prev=i;
				break;
			}
		}

		for(;i<a.length;i++){
			if(a[i]==x || a[i]==y){
				if(a[prev]!=a[i] && i-prev<min){
					min=i-prev;
					prev=i;
				}
				else{
					prev=i;
				}
			}
		}
		return min;

	}




}