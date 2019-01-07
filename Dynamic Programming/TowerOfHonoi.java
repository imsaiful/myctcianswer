-class TowerOfHonoi{
	public static void main(String[] args) {
		int n=4;
		ChangeStack(n,'A','B','C');
	}
	public static void ChangeStack(int n,char from_rod,char to_rod,char aux_rod){
		if(n==1){
			System.out.println("move plate 1 from rod "+from_rod+" to rod "+to_rod);
			return;
		}
		ChangeStack(n-1,from_rod,aux_rod,to_rod);
		System.out.println("move plate "+n+" from rod "+from_rod+" to rod "+to_rod);
		ChangeStack(n-1,aux_rod,to_rod,from_rod);




	}
	

}