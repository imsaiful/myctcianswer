import java.util.*;
class NextGreater{
	public static void main(String[] args) {
		int[] a={5,3,4,9,7,6};

		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+"");
		}
		System.out.println("");
		int i;
		for(i=a.length-1;i>=0;i--){
			if(a[i]>a[i-1]){
				break;
			}
		}

		int min=i;
		int x=a[i-1];
		for(int j=i+1;j<a.length;j++){
			if(a[j]>x && a[j]<a[min]){
				min=j;
			}
		}

		int temp=x;
		a[i-1]=a[min];
		a[min]=temp;


		Arrays.sort(a,i,a.length);


		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+"");
		}



	}




}