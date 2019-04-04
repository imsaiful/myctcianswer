import java.util.Comparator;

/* Dijkarstra with priority Queue*/

class DNode{
    int node;
    int weight;
    Node(int x,int y){
        node=x;
        weight=y;
    }
}

class DijkastraPQ{
    int V;
    HashSet<Integer> hs;
    int[] distance;
    DijkastraPQ(int v){
        V=v;
        distance=new int[v+1];
    }

    public void help(int[][] g,int s){
        PriorityQueue<DNode> pq=new PriorityQueue<DNode>(V,new Comparator<DNode>() {
            public int compare(DNode a,DNode b){
                return a.weight-b.weight;
            }
        });







    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int v=in.nextInt();
        int e=in.nextInt();
        int[][] g=new int[v+1][v+1];
        for(int i=0;i<e;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int w=in.nextInt();
            g[a][b]=w;
            g[b][a]=w;
        }    
        DijkastraPQ dpq=new DijkastraPQ(v);
        System.out.println(dpq.help(g,1));

    }    







}