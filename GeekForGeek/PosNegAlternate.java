class PosNegAlternate{
	public static void main(String[] args) {
		int[] a={-1, 2, -3, 4, 5, 6, -7, 8, 9}; 	
		int n=a.length;
		int j=0;
		for(int i=0;i<n;i++){
			if(a[i]<0){
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		int pos=j+1,neg=0;
		while(pos<n && neg<pos && a[neg]<0){
			int temp=a[pos];
			a[pos]=a[neg];
			a[neg]=temp;
			neg+=2;
			pos++;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}



	}
}