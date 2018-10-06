class Max_cont_sum{
	public static void main(String[] args){
		int a[]={-2,-3,4,-1,-2,1,5,-3};
		int max=0;
		int temp=0;
		for(int i=0;i<a.length;i++){
			temp+=a[i];
			if(temp>max){
				max=temp;
			}
			if(temp<0){
				temp=0;
			}
		}
		System.out.println(max);



	}



}