class ZeroAtStart{
	public static void main(String[] args) {
		int[] a={1,2,0,3,4,1,0,3,0,6,0,3,8,9};
		int[] b=new int[a.length];
		int index=a.length-1;
		int flag=0;

		int count=a.length-1;
		for(int i=a.length-1;i>=0;i--){
			if(a[i]!=0){
				a[index--]=a[i];
			}
		}
		while(index>=0){
			a[index--]=0;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}





	}
	


}