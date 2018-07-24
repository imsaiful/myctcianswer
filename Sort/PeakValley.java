import java.lang.*;
class PeakValley{
	public static void main(String[] args){
		int a[]={1,9,11,18,2,6,19,7,4,33,16,20};
		for(int i=0;i<a.length;i+=2){
			int bi=FindBI(a,i-1,i,i+1);
			if(i!=bi){
			swap(a,i,bi);
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static int FindBI(int[] ar,int a,int b,int c){
		int l=ar.length;
		int av=a>0&&a<l?ar[a]:Integer.MIN_VALUE;
		int bv=b>0&&b<l?ar[b]:Integer.MIN_VALUE;
		int cv=c>0&&c<l?ar[c]:Integer.MIN_VALUE;


		int max=Math.max(av,Math.max(bv,cv));
		if(av==max){
			return a;
		}
		else if(bv==max){
			return b;
		}
		else
			return c; 
		
	}
	public static void swap(int[] ar,int a, int b){
		int temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
	}



}