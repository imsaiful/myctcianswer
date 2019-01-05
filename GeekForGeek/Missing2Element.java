class Missing2Element{
	public static void main(String[] args) {
		int[] a={1,2,3,4,7,8,9,10};
		boolean[] b=new boolean[a.length+3];
		for(int i=0;i<a.length;i++){
			b[a[i]]=true;
		}
		for(int i=1;i<b.length;i++){
			if(!b[i]){
				System.out.println(i);
			}
		}



	}


}