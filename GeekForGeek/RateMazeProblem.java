class RateMazeProblem{
	public static void main(String[] args) {
		int[][] a={{1, 0, 0, 0}, 
		            {1, 1, 0, 1}, 
		            {0, 1, 0, 0}, 
		            {1, 1, 1, 1} 
		        };
		SolveMaze(a);
	}

	public static void SolveMaze(int[][] a){
		int[][] s={{0, 0, 0, 0}, 
		            {0, 0, 0, 0}, 
		            {0, 0, 0, 0}, 
		            {0, 0, 0, 0} 
		        };
		if(isPossible(a,0,0,s)){
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(s[i][j]+"  ");
				}
				System.out.println();
			}
			
		}
		else{
			System.out.println("No solution is possible");
		}
	}

	public static boolean isPossible(int[][] a,int x , int y , int[][] s){
		if(x==3 && y==3){
			s[x][y]=1;
			return true;
		}
		if(isSafe(a,x,y)){
			s[x][y]=1;
			if(isPossible(a,x+1,y,s)){
				return true;
			}
			if(isPossible(a,x,y+1,s)){
				return true;
			}
			s[x][y]=0;
			return false;
		}
		return false;
	}

	public static boolean isSafe(int[][] a,int x,int y){
		return x>=0 && x<4 && y>=0 && y<4 && a[x][y]==1;
	}



}