class ZeroAtStart{
	public static void main(String[] args) {
		int[] a={1,2,0,3,4,1,0,3,0,6,0,3,8,9};
		int[] b=new int[a.length];
		int index1=0;
		int flag=0;

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				flag++;
			}
		}

		int index2=flag;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				b[index1++]=a[i];
			}
			else{
			
				b[index2++]=a[i];	
	
				
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+"  ");
		}




	}
	


}