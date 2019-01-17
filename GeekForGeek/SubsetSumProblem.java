class SubsetSumProblem{
	public static void main(String[] args) {
		int[] set = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		boolean[][] temp=new boolean[set.length+1][sum+1];
		
		for(int i=0;i<set.length;i++){
			temp[i][0]=true;
		}
		for(int i=1;i<=set.length;i++){
			for (int j=1;j<=sum ;j++ ) {
				if(j-set[i-1]>=0){
					temp[i][j]=temp[i-1][j] || temp[i-1][j-set[i-1]];
				}
				else{
					temp[i][j]=temp[i-1][j];	
				}
			}
		}
		System.out.println(temp[set.length][sum]);
	}
	
}