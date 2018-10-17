import java.util.*;
class FourthSum{
	public static void main(String[] args) {
		int[] a = {1, 4, 45, 6, 10, 12};
		int x=21;
		Find_El(a,x);
	
	}
	public static void Find_El(int[] a,int x){
		Arrays.sort(a);
		int n=a.length;
		for(int i=0;i<n-3;i++){
			for(int j=i+1;j<n-2;j++){
				int l=j+1;
				int r=n-1;
				while(l<=r){
					System.out.println(a[i]+" "+a[j]+" "+a[l]+" "+a[r]);
					if(a[i]+a[j]+a[l]+a[r]==x){
						System.out.println(a[i]+" "+a[j]+" "+a[l]+" "+a[r]);
						l++;
						r--;
						break;
					}
					else if(a[i]+a[j]+a[l]+a[r]>x){
						r--;
					}
					else{
						l++;
					}
				}
			}
		}
	}
}
 