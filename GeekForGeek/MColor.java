/*m Coloring Problem | Backtracking-5
Given an undirected graph and a number m, determine if the graph can be colored with at most m colors such that no two adjacent vertices of the graph are colored with same color. Here coloring of a graph means assignment of colors to all vertices.
Input:
1) A 2D array graph[V][V] where V is the number of vertices in graph and graph[V][V] is adjacency matrix representation of the graph. A value graph[i][j] is 1 if there is a direct edge from i to j, otherwise graph[i][j] is 0.
2) An integer m which is maximum number of colors that can be used.

Output:
An array color[V] that should have numbers from 1 to m. color[i] should represent the color assigned to the ith vertex. The code should also return false if the graph cannot be colored with m colors.*/

import java.util.*;

class MColor{
	final static int V=4;
	public static void main(String[] args) {
		int[][] g={{0,1,1,1},{1,0,1,0},{1,1,0,1},{1,0,1,0}};
		int m=3;	
		help(g,m);
	}
	public static void help(int[][] g,int m){
		if(m>=V){
			System.out.println("Color the graph vertices using any distict color is possible");
			return;
		}
		int[] color=new int[V];
		Arrays.fill(color,0);
		if(!colorGraphPossible(g,color,m,0)){
			System.out.println("Solution does not exist");
		}
		else{
			for(int i=0;i<V;i++){
				System.out.println(color[i]+" ");
			}
		}
	}
	public static boolean colorGraphPossible(int[][] g,int[] color,int m,int v){
		if(v==V){
			return true;
		}
		for(int c=1;c<=m;c++){
			if(isValid(g,color,v,c)){
				color[v]=c;
				if(colorGraphPossible(g,color,m,v+1)){
					return true;
				}
				color[v]=0;
			}
		}
		return false;
	}
	public static boolean isValid(int[][] g,int[] color,int v,int c){
		for(int i=0;i<V;i++){
			if(g[v][i]==1 && c==color[i]){
				return false;
			}
			
		}
		return true;
	}


}