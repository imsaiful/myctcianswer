/*Next Greater Element
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.*/

class NextGreaterRightSide{
	public static void main(String[] args) {
		int[] a={13, 7, 6, 12};
		int[] temp=new int[a.length];
		int n=a.length-1;
		boolean flag=false;
		for(int i=n;i>=0;i--){
			int j=i+1;
			flag=false;
			while(j<=n){
				if(a[i]<a[j]){
					temp[i]=a[j];
					break;
				}
				j++;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(temp[i]+"  ");
		}
		System.out.print(temp[n]);
	}


}

