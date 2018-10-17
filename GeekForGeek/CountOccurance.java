class CountOccurance{
	public static void main(String[] args) {
			int[] a={1,3,7,9,9,9,9,14,19,22};
			System.out.println(Count_Occurance(a,9));
		}	

		public static int Count_Occurance(int[] a,int x){
			int m=a.length;
			int ind=Find_index(a,x,0,a.length-1);
			if(ind==-1){
				return 0;
			}
			int flag=1;
			int left=ind-1;
			while(left>=0 && a[left]==x){
				flag++;
				left--;
			}
			int right=ind+1;
			while(right<m && a[right]==x){
				flag++;
				right++;
			}



			return flag;



		} 
		public static int Find_index(int[] a,int x,int start,int end){
			if(start>end){
				return -1;
			}
			int mid=start+(end-start)/2;
			if(a[mid]==x){
				return mid;
			}
			if(a[mid]<x){
				return Find_index(a,x,start,mid-1);
			}
			return Find_index(a,x,mid+1,end);




		}




}