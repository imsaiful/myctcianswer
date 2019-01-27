/*Given a sorted array of number , value K and value X, find the K nearest number to the value
Example: Input 12 16 22 30 35 39 42 45 48 50 53 55 56 K = 4 X = 35
Output 22 30 39 42*/

class FindInSortedArrayAdjacent{
	public static void main(String[] args) {
		int[] a={12,16,26,30,35,39,42,45,48,50,53,55,56};
		Print(a,35,4);
	}
	public static void Print(int[] a,int k,int n){
		int index=FindIndex(a,k,0,a.length-1);
		System.out.println(index);
		int l= index-1;
		int r=index+1;
		int count=0;
		 if (a[l] == k) l--; 
		System.out.println(count+" "+n+" "+" "+l+" "+r);
		while(count<n && l>0 && r<a.length-1)
		{
			if(k-a[l]<a[r]-k){
				System.out.print(a[l--]+"  ");
			}
			else{
				System.out.print(a[r++]+"  ");	
			}
			count++;
		}
		while(count<n && l==0 && r<a.length-1){
			System.out.println(a[r++]);
			count++;
		}
		while(count<n && r==a.length-1 && l>0){
			System.out.println(a[l--]);
			count++;
		}

	}

	public static int FindIndex(int[] a,int x,int l,int h){
		if(l>h){
			return -1;
		}
		if(l==h){
			return l;
		}
		while(l<=h){
			int mid=l+(h-l)/2;
			//System.out.println(a[mid]+"  ");
			if(a[mid]==x){
				return mid;
			}
			else if(a[mid]>x){
				h=mid-1;
			}
			else{
				l=mid+1;
			}
		}
		return -1;
	}
}
