class QuickSort{
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		QuickSort(a,0,a.length-1);
		Print(a);
	}

	public static void QuickSort(int[] a, int low, int high){
		if(low<high){
			int pivot=FindPivot(a,low,high);
			QuickSort(a,low,pivot-1);
			QuickSort(a,pivot+1,high);
		}
	}

	public static int FindPivot(int[] a,int low,int high){
		int i=low-1;
		int pivot=a[high];
		for(int j=low;j<=high;j++){
			if(a[j]<a[high]){
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	public static void Print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
}