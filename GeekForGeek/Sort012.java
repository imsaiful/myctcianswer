class Sort012{
	public static void main(String[] args) {
		int[] a={1,2,0,0,0,2,2,2,1,1,0,1,2};
		int[] c={0,0,0};
		for(int k=0;k<a.length;k++){
			c[a[k]]+=1;
		}
		
		int i=0;
		int m=0;
		int index=0;
		while(m<=a.length+1){
			
			if(c[i]==0){
				i++;
			}
			else{
				a[index++]=i;
				//System.out.print(a[i]+"  ");
				c[i]-=1;
			}
			m++;
			
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+"  ");
		}
	}

}