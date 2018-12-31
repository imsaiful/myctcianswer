class SingleInSorted{
	public static void main(String[] args){
		int[] a={1,1,2,2,3,4,4,5,5,6,6,7,7};
		int opr=help(a,0,a.length-1);
		System.out.println(opr);
	}
	public static int help(int[] a,int low,int high){
		if(low>high){
			return -1;
		}
		if(low==high){
			return a[low];
		}

		int mid=low+(high-low)/2;
		if(mid%2==0){
			if(a[mid]==a[mid+1]){
				return help(a,mid+2,high);
			}
			else{
				return help(a,low,mid);
			}
		}
		else{
			if(a[mid]==a[mid-1]){
				return help(a,mid+1,high);
			}
			else{
				return help(a,low,mid-1);
			}
		}

	}
}