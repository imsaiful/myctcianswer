// Simple Java program to print next  
// greater elements in a given array 

class NextGreaterElement {
	public static void main(String[] args) {
		//input array
		int a[]= {11,13,21,3}; 
		help(a);
	}

	public static void help(int[] a){
		//length of array
		int n=a.length;
		//temporary array to store index
		int[] index=new int[n];
		//assign -1 to the right most element as it does not have any next greater element
		index[n-1]=-1;
		//start our loop from second last element
		for(int i=n-2;i>=0;i--){
			//start comparion with the next element
			int j=i+1;
			while(j!=-1){
				if(a[i]<a[j]){
					//if next element is greater than save it's index and break the loop
					index[i]=j;
					break;
				}
				//if element is lesser then save start comparing with the element which is next greatest
				j=index[j];
			}
			if(j==-1){
				//if no element found save -1 in your index array
				index[i]=-1;
			}
		}

		for(int i=0;i<a.length;i++){
			if(index[i]!=-1){
				//Print the value which is next greatest with the help of index array 
				System.out.println(a[i]+" -- "+a[index[i]]);
			}
			else{
				//if index store value -1 then no index exist which have value greater than current element
				System.out.println(a[i]+" -- "+"-1");
			}
		}
	}
}