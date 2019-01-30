/*The Celebrity Problem
In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “. Find the stranger (celebrity) in minimum number of questions.

We can describe the problem input as an array of numbers/characters representing persons in the party. We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise. How can we solve the problem*/

class CelebrityProblem{
	public static void main(String[] args) {
		int m[][] = { { 0, 0, 1, 0 }, 
                            { 0, 0, 1, 0 }, 
                            { 0, 0, 0, 0 },  
                            { 0, 0, 1, 0 } }; 
        int index=help(m)+1;
        if(index!=0){
        	System.out.println("Celebrity name is "+(char)(64+index));
        }	
        else{
        	System.out.println("There is no celebrity in the party");
        }
	}
	public static int help(int[][] m){
		int a=0,b=m.length-1;
		while(a<b){
			if(m[a][b]==1){
				a++;
			}
			else{
				b--;
			}
		}
		System.out.println(a);
		for(int i=0;i<m.length;i++){
			if(i!=a && m[i][a]!=1 && m[a][i]==0){
				return -1;
			}
		}
		return a;



	}
}