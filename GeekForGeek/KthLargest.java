//k largest(or smallest) elements in an array | added Min Heap method
class KthLargest{
	public static void main(String[] args) {
		int[] a={1, 23, 12, 9, 30, 2, 50};
		int k=0;
		int j=0;
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			if(k<3){
				System.out.println(a[j]+" ");	
				k++;
			}
		}
		
	}
}