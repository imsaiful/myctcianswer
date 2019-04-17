/*Count all possible walks from a source to a destination with exactly k edges*/
/*Given a directed graph and two vertices ‘u’ and ‘v’ in it, count all possible walks from ‘u’ to ‘v’ with exactly k edges on the walk.*/

class WalkInGraph{
    public static void main(String[] args) {
        int g[][] =new int[][] { {0, 1, 1, 1}, 
            {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 0}};
        int s=0;
        int d=3;
        int k=2;
        System.out.println(help(g,s,d,k));
    }    
    public static int help(int[][] g,int s,int d,int k){
        int count=0;
        if(k==0 && s==d){
            return 1;
        }
        if(k==1 && g[s][d]==1){
            return 1;
        }
        if(k<0){
            return -1;
        }
        for(int i=0;i<g.length;i++){
            if(g[s][i]==1){
                count+=help(g,i,d,k-1);
            }
        }
        return count;


    }
}