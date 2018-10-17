class FirstAndLast{
	public static void main(String[] args) {
		int a[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8}; 
		int x=2;
		int first=FindFirst(a,x,0,a.length-1,a.length);
		int last=FindLast(a,x,0,a.length-1,a.length);
		System.out.println(first+" "+last);	
	}
	public static int FindFirst(int[] a,int x,int start,int end,int n){
		if(end>=start){
			int mid=start+(end-start)/2;
			if((mid==0 || x>a[mid-1]) && a[mid]==x){
				return mid;
			}
			else if(x>a[mid]){

				return FindFirst(a,x,mid+1,end,n);
			}
			else{
				return FindFirst(a,x,start,mid-1,n);
			}
		}
		return -1;
	}
	public static int FindLast(int[] a,int x,int start,int end,int n){
		if(end>=start){
			int mid=start+(end-start)/2;
			if((mid==n-1 || x<a[mid+1]) && a[mid]==x){
				return mid;
			}
			else if(x<a[mid]){

				return FindFirst(a,x,mid+1,end,n);
			}
			else{
				return FindFirst(a,x,mid+1,end,n);
			}
		}
		return -1;
	}
	
	


	
}