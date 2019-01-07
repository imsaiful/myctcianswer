class KthHighest{
	public static void main(String[] args) {
		int[] a={12, 3, 5, 7, 4, 19, 26}; 
		int k=2;
		int flag=0;
		int n=a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			flag++;
			if(flag==k){
				System.out.println(a[n-i-1]);
				break;
			}


		}




	}


}