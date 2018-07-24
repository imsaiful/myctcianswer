import java.util.*;
class Merge
{
	public static void main(String args[]){
		int a[]=new int[13];
		int k=1;
		for(int i=0;i<6;i++){
			a[i]=k;
			k=k+2;
		}
		int[] b={2,4,6,8,10,12};
		Sort(a,b,6,6);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");


		}



	}

public static void Sort(int a[], int b[],int m,int n){
	System.out.println(m+" "+n);
	int l=m+n;
	m=m-1;
	n=n-1;
	
	while(n>=0){
		if(m>=0 && a[m]>b[n]){

			a[l]=a[m];
			m--;
		}
		else{
			a[l]=b[n];
			n--;
		}
		l--;
	}
}


}