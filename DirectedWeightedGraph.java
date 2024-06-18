/*

Adjacency Matrix for Directed and Weighted graph

*/
import java.util.*;

public class DirectedWeightedGraph{
	private static int v;
	private static int[][] adjacencyMatrix;

	// Constructor to intialize the graph
	DirectedWeightedGraph(int vertices){
		this.v=vertices;
		adjacencyMatrix = new int[v][v];
		for(int i=0; i<v;i++){
			Arrays.fill(adjacencyMatrix[i], Integer.MAX_VALUE);
			// Use Integer.MAX_VALUEto represent no edge
		}
	}

	// function to add a directed edge from vertex v1 to vertex v2 with a given weight
	public static void addEdge(int v1, int v2, int weight){
		adjacencyMatrix[v1][v2]=weight;
	}

	// function to display the adjacency matrix
	public static void display(){
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				if(adjacencyMatrix[i][j]==Integer.MAX_VALUE){
					System.out.print("I"+" ");
				}else{
					System.out.print(adjacencyMatrix[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	// main function
	public static void main(String[] args){
		DirectedWeightedGraph graph = new DirectedWeightedGraph(5);

		graph.addEdge(0,1,4);
		graph.addEdge(0,2,3);
		graph.addEdge(0,3,1);
		graph.addEdge(0,4,4);
		graph.addEdge(1,1,2);
		graph.addEdge(1,3,6);
		graph.addEdge(2,2,5);
		graph.addEdge(2,0,3);
		graph.addEdge(3,4,2);
		graph.addEdge(3,3,3);
		graph.addEdge(4,0,4);
		graph.addEdge(4,4,5);

		graph.display();
	}
}


/*

Time Complexity :

Adding an Edge -
The addEdge method updates one element in the adjacency matrix.
Each update operation is O(1).

Displaying the Adjacency Matrix -
The display method involves iterating over all V2 elements of the matrix and printing them.
The nested loops iterate V times each, resulting in V2 iterations.

addEdge method - O(1)
display method - O(V^2)

Space Complexity :

The space complexity of the graph representation using an adjacency matrix is determined by the storage requirements of the matrix itself.

The adjacency matrix is a 2D array of size V×V, where V is the number of vertices in the graph.
Each element in the matrix is an integer (representing the weight of the edge between two vertices, or a special value like Integer.MAX_VALUE for no edge).

Space Complexity - O(V^2)

*/
