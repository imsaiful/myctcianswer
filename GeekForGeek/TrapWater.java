/* Trapping Rain Water :Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.*/
class TrapWater{
	public static void main(String[] args) {
		int[] a={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int[] l=new int[a.length];
		int[] r=new int[a.length];
		l[0]=a[0];
		for(int i=1;i<a.length;i++){
			l[i]=Math.max(l[i-1],a[i]);
		}
		int n=a.length;
		r[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--){
			r[i]=Math.max(r[i+1],a[i]);
		}


		int max=0;
		for(int i=0;i<a.length;i++){
			max+=Math.min(l[i],r[i])-a[i];
		}

		System.out.println(max);

	}




}