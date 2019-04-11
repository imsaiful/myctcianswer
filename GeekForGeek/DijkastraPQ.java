import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

class DijkastraPQ{
    int V;
    HashSet<Integer> hs;
    int[] distance;
    PriorityQueue<DNode> pq;

    static class DNode{
        int node;
        int weight;
        DNode(int x,int y){
            node=x;
            weight=y;
        }
    }
    DijkastraPQ(int v){
        V=v;
        distance=new int[v+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        pq=new PriorityQueue<DNode>(V,new Comparator<DNode>() {
            public int compare(DNode a,DNode b){
                return a.weight-b.weight;
            }
        });
        hs=new HashSet<Integer>();                    
        
    }

    public void help(int[][] g,int s){
        
        pq.add(new DNode(s, 0));
        distance[1]=0;
        while(!pq.isEmpty()){
           
            int node=pq.remove().node;
           
            hs.add(node);
            updateNeighbour(g,node);
        }
        for(int i=2;i<=V;i++){
            System.out.print(distance[i]+" ");
        }
    }
    public void updateNeighbour(int[][] g,int s){
        for(int i=1;i<=V;i++){
            if(!hs.contains(i) && g[s][i]!=Integer.MAX_VALUE){
                if(g[s][i]+distance[s]<distance[i]){
                    distance[i]=g[s][i]+distance[s];
                    pq.add(new DNode(i,distance[i]));
                }
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int v=in.nextInt();
        int e=in.nextInt();
        int[][] g=new int[v+1][v+1];
        for(int i=1;i<=v;i++){
            for(int j=1;j<=v;j++){
                g[i][j]=Integer.MAX_VALUE;
            }
        }    
        for(int i=0;i<e;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int w=in.nextInt();
            g[a][b]=w;
            g[b][a]=w;
        }
        DijkastraPQ dpq=new DijkastraPQ(v);
        dpq.help(g,1);
    } 
}