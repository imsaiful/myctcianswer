/*1. Given a String s and int r , first fill each character row wise and print column wise.
for e.g. String s = “abcdefgh” and r = 3
so filling column wise would give :
a d g
b e h
c f*/

class FillEachChararcter{
	public static void main(String[] args) {
		String s="abcdefgh";
		int r=3;
		int index=0;
		char[][] c=new char[r][r];
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if(index<s.length()){
					c[j][i]=s.charAt(index++);
				}
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				System.out.print(c[i][j]);
			}
		} 
	}



}