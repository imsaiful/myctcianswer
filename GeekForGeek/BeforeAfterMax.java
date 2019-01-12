class BeforeAfterMax{
	public static void main(String[] args) {
		 int[] a = {5, 1, 4, 3, 6, 8, 10, 7, 9}; 
		 int[] left=new int[a.length];
		 left[0]=a[0];
		 for(int i=1;i<a.length;i++){
		 	left[i]=Math.max(a[i-1],left[i-1]);
		 }	
		 int rightmin=Integer.MAX_VALUE;
		 for(int i=a.length-1;i>=0;i--){
		 	if(a[i]>left[i] && rightmin>a[i]){
		 		System.out.println(i+"  ");
		 		break;
		 	}
		 	rightmin=Math.min(a[i],rightmin);
		 }


	}
}