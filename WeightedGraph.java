/*
	Adjacency Matrix for Undirected and Weighted graph
*/

import java.util.*;

public class WeightedGraph{
	private static int v;
	private static int[][] adjacencyMatrix;

	// Constructor to intialize graph
	WeightedGraph(int vertices){
		this.v=vertices;
		adjacencyMatrix = new int[v][v];
		for(int i=0;i<v;i++){
			Arrays.fill(adjacencyMatrix[i],Integer.MAX_VALUE);
			// Use Integer.MAX_VALUE to represent no edge
		}
	}

	// function to add an edge between 2 vertices with a given weight
	public static void addEdges(int v1, int v2, int weight){
		adjacencyMatrix[v1][v2]=weight;
		adjacencyMatrix[v2][v1]=weight;
		// Since it's an undirected graph
	}

	// function to display the adjacency matrix
	public static void display(){
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				if(adjacencyMatrix[i][j]==Integer.MAX_VALUE){
					System.out.print("I"+ " ");
				}else{
					System.out.print(adjacencyMatrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		WeightedGraph graph = new WeightedGraph(5);

		graph.addEdges(0,1,3);
		graph.addEdges(0,3,2);
		graph.addEdges(1,1,5);
		graph.addEdges(1,2,8);
		graph.addEdges(1,4,3);
		graph.addEdges(2,1,8);
		graph.addEdges(2,3,1);
		graph.addEdges(3,1,4);
		graph.addEdges(3,0,2);
		graph.addEdges(3,3,6);
		graph.addEdges(4,0,7);

		graph.display();
	}
}


/*

Time complexity :

Adding an Edge - 
The addEdge method updates two elements in the adjacency matrix.
Each update operation is O(1).

Displaying the Adjacency Matrix -
The display method involves iterating over all V2 elements of the matrix and printing them.
The nested loops iterate V times each, resulting in V2 iterations.

addEdge method: O(1)
display method: O(V^2)

Space Complexity :

The space complexity of the graph representation using an adjacency matrix is determined by the storage requirements of the matrix itself.

The adjacency matrix is a 2D array of size V×V, where V is the number of vertices in the graph.
Each element in the matrix is an integer, representing the weight of the edge between two vertices.

space complexity - O(V^2)

*/
