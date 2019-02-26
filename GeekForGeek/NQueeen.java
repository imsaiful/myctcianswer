/* 
* Given nxn board place n queen on this board so that they dont attack each other. One solution is to find
 * any placement of queens which do not attack each other. Other solution is to find all placements of queen
 * on the board.
 *
 * Time complexity O(n*n)
 * Space complexity O(n*n)
 */
 class Position{
 	int r;
 	int c;
 	Position(int r,int c){
 		this.r=r;
 		this.c=c;
 	}
 }


 class NQueeen{
 	public static void main(String[] args) {
 		int N=4;
 		SolveNQueen(N);
 	}
 	public static void SolveNQueen(int N){
 		Position[] p=new Position[N];
 		boolean flag=getPosition(N,0,p);
 		if(flag){
 			for(int i=0;i<N;i++){
 				System.out.println("("+p[i].r+","+p[i].c+")");
 			}
 		}
 		else{
 			System.out.println("No position found");
 		}
 	}
 	public static boolean getPosition(int N,int row,Position[] p){
 		if(row==N){
 			return true;
 		}
 		for(int col=0;col<N;col++){
 			boolean foundSafe=true;
 			for(int q=0;q<row;q++){
 				if(p[q].c==col || p[q].c+p[q].r==col+row || p[q].r-p[q].c==row-col){
 					foundSafe=false;
 					break;
 				}
 			}
 			if(foundSafe){
 				p[row]=new Position(row,col);
 				if(getPosition(N,row+1,p)){
 					return true;
 				}
 			}
 		}
 		return false;
 	}
 }