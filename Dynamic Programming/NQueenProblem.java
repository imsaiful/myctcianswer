class NQueenProblem{
	public class Position{
		int row,col;
		Position(int row,int col){
			this.row=row;
			this.col=col;
		}
	}
	public static void main(String[] args){
		int n=4;
		NQueenProblem nq=new NQueenProblem();
		Position[] result=nq.NQueenProblemSolution(n);
		for(int i=0;i<n;i++){
			System.out.print("("+result[i].row+","+result[i].col+")"+" ");
		}
	}
	public Position[] NQueenProblemSolution(int n){
		Position[] position=new Position[n];
		boolean hasSolution=FindSafeStateSolution(n,0,position);
		if(hasSolution){
			return position;
		}
		else
			return new Position[n];
	}
	public boolean FindSafeStateSolution(int n,int row,Position[] position)
	{
		if(row==n){
			return true;
		}
		int col;
		for(col=0;col<n;col++)
			{
					boolean foundsafe=true;
					for(int queen=0;queen<row;queen++)
					{
						if(position[queen].col==col || position[queen].row-position[queen].col==row-col || 
							position[queen].row+position[queen].col==row+col)
						{
							foundsafe=false;
							break;
						}
					}
					if(foundsafe)
					{
						position[row]=new Position(row,col);
						if(FindSafeStateSolution(n,row+1,position))
						{
							return true;
						}
					}
			}
		return false;
	}
}
