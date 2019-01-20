class MaxZero{
	public static void main(String[] args) {
		int[] a= { 1, 0, 1, 1, 1, 0, 0 };
		int min=0,max=0,d=0;
		for(int i=0;i<a.length;i++){
			int flag=0;
			for(int j=i;j<a.length;j++){
				if(a[j]==1){
					flag++;
				}
				else{
					flag--;
				}
				if(flag==0 && (j-i)>d){
					min=i;
					max=j;
					d=j-i;

				}
			}
		}
		System.out.println(min+"  "+max);	
	}


	
}