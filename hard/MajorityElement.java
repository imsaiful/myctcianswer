class MajorityElement{
	public static void main(String[] args) {
		int[] a={3,1,7,1,3,7,3,7,1,7,7};
		int number=Find_majprity(a);
		if(number_validate(a,number)){
			System.out.println(number);	
		}
		else{
			System.out.println("-1");
		}
	}
	static int Find_majprity(int[] a){
		int count=0;
		int majority=0;
		for(int i=0;i<a.length;i++){
			if(count==0){
				majority=a[i];
			}
			if(majority==a[i]){
				count++;
			}
			else{
				count--;
			}
		}
		return majority;
	}

	static boolean number_validate(int[] a,int number){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==number){
				count++;
			}
		}
		if(count>=a.length/2){
			return true;
		}
		return false;



	}
}