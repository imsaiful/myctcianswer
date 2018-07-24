class MatrixSearch{
	public static void main(String[] args){
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("ENter the element to search");
		int x=in.nextInt();
		int c=a.length-1;
		int n=a.length;
		int r=0;
		boolean flag=true;
		while(r<n && c>=0){
			if(a[r][c]==x)
			{
				System.out.println("Element found at "+r+" row and "+c+" coloumn");
				flag=false;
				break;
			}
			else if(a[r][c]>x){
				c--;
			}
			else
			{
				r++;
			}
		}
		if(flag){
			System.out.println("Element is not present");
		}


	}


}
