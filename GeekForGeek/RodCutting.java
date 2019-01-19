class RodCutting{
	public static void main(String[] args) {
		int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
		int t=8;
		System.out.println(helpdp(price,8));
	}

	public static int helpdp(int[] price,int n){
		int val[] = new int[n+1]; 
        val[0] = 0; 
  
        // Build the table val[] in bottom up manner and return 
        // the last entry from the table 
        for (int i = 1; i<=n; i++) 
        { 
            int max_val = Integer.MIN_VALUE; 
            for (int j = 0; j < i; j++) 
                max_val = Math.max(max_val,price[j] + val[i-j-1]); 
            val[i] = max_val; 
        } 
  
        return val[n]; 
		        


	} 
}