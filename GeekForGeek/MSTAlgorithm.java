import java.util.*;
class MSTAlgorithm{
    static class Edge{
        int s;
        int d;
        int w;
        Edge(int s,int d, int w){
            this.s=s;
            this.d=d;
            this.w=w;
        }
    }
    int V;
    ArrayList<Edge> edges=new ArrayList<>();
    MSTAlgorithm(int v){
        V=v;
    }
    public void addEdge(int s,int d,int w){
        Edge edge=new Edge(s,d,w);
        edges.add(edge);
    }
    public int KruskalMST(){
        PriorityQueue<Edge> pq=new PriorityQueue<Edge>(edges.size(),new Comparator<Edge>() {
            public int compare(Edge e1,Edge e2){
                return e1.w-e2.w;
            }
        });
        for(int i=0;i<edges.size();i++){
            pq.add(edges.get(i));
        }


        int[] parent=new int[edges.size()];

        makeSet(parent);

        ArrayList<Edge> result=new ArrayList<Edge>();
        int index=0;
        while(index<V-1){
            Edge temp=pq.remove();
            int x_set=find(parent,temp.s);
            int y_set=find(parent,temp.d);
            if(x_set==y_set){

            }
            else{
                result.add(temp);
                index++;
                union(parent,x_set,y_set);
            }
        }
        int max=0;
        for(Edge e:result){
            max+=e.w;
        }
        return max;
    }

    public void union(int[] parent,int x,int y){
        int x_set_parent=find(parent,x);
        int y_set_parent=find(parent,y);
        parent[y_set_parent]=x_set_parent;
    }



    public int find(int[] parent,int s){
        if(parent[s]!=s){
            return find(parent,parent[s]);
        }
        return s;
    }

    public void makeSet(int[] p){
        for(int i=0;i<p.length;i++){
            p[i]=i;
        }
    }


    public static void main(String[] args) {
         int v=4;
         MSTAlgorithm g=new MSTAlgorithm(v);
         g.addEdge(1,2,7);
         g.addEdge(1,4,6);
         g.addEdge(4,2,9);
         g.addEdge(4,3,8);
         g.addEdge(2,3,6);
         System.out.println(g.KruskalMST());
        
    }

    
}