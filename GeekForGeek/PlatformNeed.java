class PlatformNeed{
	public static void main(String[] args) {
		
    int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
    int number_of_platform=Calculate(arr,dep);
    System.out.println(number_of_platform);
	}
	public static int Calculate(int[] arr,int[] dep){
		Arrays.sort(arr);
		Arrays.sort(dep);
		int n=arr.length;
		int i,j,max,current;
		i=j=max=current=0;
		while(i<n && j<n){
			if(arr[i]<=dep[j]){
				current++;/
				if(current>max){
					max++;
				}
				i++;
			}
			else{
				current--;
				j++;

			}
		}
		return max;
	}
}