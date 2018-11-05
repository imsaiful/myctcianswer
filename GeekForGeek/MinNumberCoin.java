import java.util.*;
class MinNumberCoin{
	public static void main(String[] args) {
		int[] a={1,6,5,9}; 
		int w=11;
		FindMin(a,w);	
	}
	public static void FindMin(int[] a,int w){
		int n=a.length;
		int[] t=new int[w+1];
		int[] r=new int[w+1];
		t[0]=0;
		for(int i=1;i<=w;i++){
			t[i]=Integer.MAX_VALUE;
		}
		Arrays.fill(r,-1);
		for(int j=0;j<a.length;j++){
			for(int i=1;i<=w;i++){
				if(i>=a[j]){
					if(t[i-a[j]]+1<t[i]){
						t[i]=t[i-a[j]]+1;
						r[i]=j;
					}
				}
			}
		}
		System.out.println(t[w-1]);
	}
}