/*

Adjacency Matrix for Undirected and Unweighted graph

*/

import java.util.*;

public class GraphUndirectedUnweighted{
	private static int v;
	private static int[][] adjacencyMatrtix;

	// Constructor to initialize the graph
	public GraphUndirectedUnweighted(int vertices){
		this.v=vertices;
		adjacencyMatrtix = new int[v][v];
	}

	public static void addEdge(int v1, int v2){
		adjacencyMatrtix[v1][v2]=1;
		adjacencyMatrtix[v2][v1]=1; 
		// Since it's an undirected graph that is why we are assigning 1 for both ways
	}

	public static void display(){
		System.out.println();
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				System.out.print(adjacencyMatrtix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		GraphUndirectedUnweighted graph = new GraphUndirectedUnweighted(7);

		// Add Edges
		graph.addEdge(0,1);
		graph.addEdge(0,6);
		graph.addEdge(1,1);
		graph.addEdge(1,2);
		graph.addEdge(1,5);
		graph.addEdge(2,5);
		graph.addEdge(3,2);
		graph.addEdge(3,4);
		graph.addEdge(5,6);
		graph.addEdge(4,4);
		graph.addEdge(5,1);
		graph.addEdge(6,1);

		// display matrix
		graph.display();
	}
}

/*
Time Complexity:
Adding an Edge - 
The addEdge method updates two elements in the adjacency matrix.
Each update operation is 
O(1)

Since we perform a constant amount of work for each call to addEdge

Displaying the Adjacency Matrix - 
The display method involves iterating over all 𝑉2 elements of the matrix and printing them.
The nested loops iterate V times each, resulting in 𝑉2 iterations.

addEdge method: O(1)
display method: O(V^2)

Space Complexity: 

The space complexity of the graph representation using an adjacency matrix is determined by the storage requirements of the matrix itself.

The adjacency matrix is a 2D array of size V×V, where V is the number of vertices in the graph.
Each element in the matrix is an integer (or a boolean in some implementations), representing the presence or absence of an edge between two vertices.

Space complexity = O(V^2)
*/
