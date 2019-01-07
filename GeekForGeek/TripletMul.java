import java.util.*;
class TripletMul{
	public static void main(String[] args) {
		int[] a={ 0, 4, 6, 2, 3, 8} ;
		int m=18;
		int flag=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			int j=i+1;
			int k=a.length-1;
			while(j<k){
				int temp=a[i]*a[j]*a[k];
				if(temp==m){
					flag++;
					j++;
				}
				else if(temp<m){
					j++;
				}
				else{
					k--;
				}
			}
		}
		System.out.println(flag);




	}



}