class SeprateEvenOdd{
	public static void main(String[] args) {
			int[] a={10, 9, 7, 18, 13, 19, 4, 20, 21, 14};
			int i=0;
			int j=a.length-1;
			while(true){
				while(i<j && a[i]%2!=0){
					i++;
				}
				while(i<j && a[j]%2==0){
					j--;
				}
				if(i<j){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else{
					break;
				}
			}
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]+" ");
			}





		}	




}