class MergeSort{
	public static void main(String[] args) {
		int[] a={10,9,8,7,6,5,4,3,2,1};
		MergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
		public static void MergeSort(int[] a,int start,int end){
			if(start<end){
				int mid=start+(end-start)/2;
				MergeSort(a,start,mid);
				MergeSort(a,mid+1,end);
				Merge(a,start,mid,end);
			}
		}
		public static void Merge(int[] a,int s,int m,int e){
			int[] temp=new int[e-s+1];
			int i=s,j=m+1,k=0;
			while(i<=m && j<= e){
				if(a[i]<=a[j]){
					temp[k++]=a[i];
					i++;
				}
				else{
					temp[k++]=a[j];
					j++;
				}
			}
			while(i<=m){
				temp[k++]=a[i++];
			}

			while(j<=e){
				temp[k++]=a[j++];
			}

			for(i=s;i<=e;i++){
				a[i]=temp[i-s];
			}


		}



	}


