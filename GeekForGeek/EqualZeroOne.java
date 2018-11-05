//Largest subarray with equal number of 0s and 1s
class EqualZeroOne{
	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 0, 1, 1}; 
		int sum=0;
		int max_size=-1,start_index=0;
		for(int i=0;i<arr.length;i++){
			sum=(arr[i]==0)?-1:1;
			for(int j=i+1;j<arr.length;j++){
				sum+=(arr[j]==0)? -1:1;
				
				if(sum==0 && max_size< (j-i+1)){
					max_size=j-i+1;
					start_index=i;
				}
			}
		}
		if(max_size==-1){
			System.out.println("No sub elemet found");
		}
		else{
			System.out.println(start_index+"  "+(max_size+start_index-1));	
		}
	}
}