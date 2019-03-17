/*Topological Sorting
Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge uv, vertex u comes before v in the ordering. Topological Sorting for a graph is not possible if the graph is not a DAG.
For example, a topological sorting of the following graph is “5 4 2 3 1 0”. There can be more than one topological sorting for a graph. For example, another topological sorting of the following graph is “4 5 2 3 1 0”. The first vertex in topological sorting is always a vertex with in-degree as 0 (a vertex with no incoming edges).*/

import java.io.*; 
import java.util.*; 
  
// This class represents a directed graph using adjacency 
// list representation 
class TopologicalSort 
{ 
    private static int V;   // No. of vertices 
    private static LinkedList<Integer> adj[]; // Adjacency List 
  
    //Constructor 
    TopologicalSort(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int v,int w) { adj[v].add(w); } 
  
    // A recursive function used by topologicalSort 
    void topologicalSortUtil(int v, boolean visited[], 
                             Stack stack) 
    { 
        // Mark the current node as visited. 
        visited[v] = true; 
        Integer i; 
  
        // Recur for all the vertices adjacent to this 
        // vertex 
        Iterator<Integer> it = adj[v].iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
            if (!visited[i]) 
                topologicalSortUtil(i, visited, stack); 
        } 
  
        // Push current vertex to stack which stores result 
        stack.push(new Integer(v)); 
    } 
  
    // The function to do Topological Sort. It uses 
    // recursive topologicalSortUtil() 
    void topologicalSort() 
    { 
        Stack stack = new Stack(); 
  
        // Mark all the vertices as not visited 
        boolean visited[] = new boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 
  
        // Call the recursive helper function to store 
        // Topological Sort starting from all vertices 
        // one by one 
        for (int i = 0; i < V; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack); 
  
        // Print contents of stack 
        while (stack.empty()==false) 
            System.out.print(stack.pop() + " "); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.topologicalSort(); 
    } 
} 