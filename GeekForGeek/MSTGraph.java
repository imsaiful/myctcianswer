/* Minimum COst Cruskal Algorithm
4 5
1 2 7
1 4 6
4 2 9
4 3 8
2 3 6
Ans:19
*/
import java.util.*;
class MSTGraph{
    static int[] parent=new int[100];
    public static int find(int i){
    
        while(parent[i]!=i){
            i=parent[i];
            System.out.println("stuck");
        }
        return i;
    }
    public static boolean union(int i,int j){
        if(i!=j){
            parent[j]=i;
            return true;
        }
        return false;
    }

    public static int mst(int[][] g){
        int a=0,b=0;
        int count_edge=g[0].length;
        int minCost=0;
        while(count_edge>1){
           // System.out.println("Enter");
            int min=Integer.MAX_VALUE;
            for(int i=1;i<g[0].length;i++){
                for(int j=1;j<g.length;j++){
                    if(g[i][j]<min){
                        min=g[i][j];
                        a=i;
                        b=j;
                    }
                }
            }
            a=find(a);
            b=find(b);
            if(count_edge==0){
                    break;
                }
            if(union(a,b)){
                
                count_edge--;
                minCost+=min;
                System.out.println(min+" "+a+" "+b+" "+minCost);
                
            }
            g[a][b] = g[b][a] = Integer.MAX_VALUE;
        }
        
        return minCost;
    }
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int v=5;
		int e=5;
		int[][] g=new int[v][v];
        for(int i=1;i<v;i++){
            for(int j=1;j<v;j++){
                g[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<e;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            int w=in.nextInt();
            g[x][y]=w;
            g[y][x]=w;
        }

        for(int i=1;i<v;i++){
            for(int j=1;j<v;j++){
                System.out.print(g[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.print(mst(g));
    }
}