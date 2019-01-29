/*Check if an undirected graph is a tree or not.*/
import java.util.*;

class CycleInGraph{
	static class Graph{
		public int V;
		static private LinkedList<Integer> adj[];
		Graph(int v){
			V=v;
			for(int i=0;i<V;i++){
				adj[i]=new LinkedList();
			}
		}
		void addEdge(int v,int w){
			adj[v].add(w);
			adj[w].add(v);

		}
}
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(3, 4);

        System.out.println(isTree(g)); 
	}

	public static boolean isTree(Graph g){
		boolean[] visited=new boolean[g.V];

		if(isCyclic(0,visited,-1)){
			return false;
		}

		for(int i=0;i<g.V;i++){
			if(!visited[i]){
				return false;
			}
		}

		return true;
	}

	public static boolean isCyclic(int v,boolean[] visited,int p){
		visited[v]=true;
		Integer i;
		Iterator<Integer> it=adj[v].iterator();
		Iterator<Integer> it=adj[v].iterator();

		while(it.hasNext()){
			i=it.next();
			if(!visited[i]){
					if(isCyclic(i,visited,p)){
						return true;
				}
			}
			else if(i!=v){
				return true;
			}
		}
		return false;
	}
}