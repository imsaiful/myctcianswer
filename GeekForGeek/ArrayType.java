class ArrayType{
	public static void main(String[] args) {
	int arr1[] = { 4, 5, 6, 1, 2, 3}; // Ascending rotated  
    findType(arr1); 
  
    int arr2[] = { 2, 1, 7, 5, 4, 3}; 
    findType(arr2); 
  
    int arr3[] = { 1, 2, 3, 4, 5, 8}; 
    findType(arr3); 
  
    int arr4[] = { 9, 5, 4, 3, 2, 1}; 
    findType(arr4); 
}

	public static void findType(int[] a){
		int n=a.length;
		int i=0;
		while(i<n-1 && a[i]<=a[i+1]){
			i++;
		}
		if(i==n-1){
			System.out.println("Accending with max element="+a[n-1]);
			return;
		}
		if(i==0){
			i=0;
			while(i<n-1 && a[i]>=a[i+1]){
				i++;
			}
			if(i==n-1){
				System.out.println("Decending with max element="+a[0]);
				return;
			}
			if(a[0]<a[i+1]){
				System.out.println("Descending rotated with max element="+Math.max(a[0],a[i+1]));
				return;
			}

			else {
				System.out.println("Ascending rotated with max element="+Math.max(a[0],a[i]));
				return;
			}
		}
		if(i<n-1 && a[0]>a[i+1]){
				System.out.println("Ascending rotated with max element="+Math.max(a[0],a[i]));
				return;
			}

			else {
				System.out.println("Descending rotated with max element="+Math.max(a[0],a[i]));

			}
	}

}