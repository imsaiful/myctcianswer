//Trapping Rain Water
class TrappingRain{
	public static void main(String[] args) {
		int[] a= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int n=a.length;
		int[] left=new int[n];
		left[0]=a[0];
		for(int i=1;i<n;i++){
			left[i]=Math.max(left[i-1],a[i]);
		}
		int[] right=new int[n];
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--){
			right[i]=Math.max(right[i+1],a[i]);
		}	
		int result=0;
		for(int i=0;i<a.length;i++){
			result+=Math.min(left[i],right[i])-a[i];
		}
		System.out.println(result);


	}
}