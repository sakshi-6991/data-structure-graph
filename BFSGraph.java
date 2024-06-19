/*

BFS traverse of a graph

*/

import java.util.*;

public class BFSGraph{
	
	private int v;
	private LinkedList<Integer>[] adjacencyList;
	
	// Constructor to intialize the graph
	@SuppressWarnings("unchecked")
	BFSGraph(int vertices){
		this.v=vertices;
		adjacencyList = new LinkedList[v];
		for(int i=0;i<v;i++){
			adjacencyList[i]=new LinkedList<>();
		}
	}

	// function to add a directed edge from vertex v1 to vextex v2
	public void addEdge(int v1, int v2){
		adjacencyList[v1].add(v2);
	}

	// function to perform BFS traversal starting from vertex startvertex
	public void bfsDirectedGraph(int startVertex){
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[startVertex] = true;
		queue.add(startVertex);
		while(!queue.isEmpty()){
			int vertex = queue.poll();
			System.out.print(vertex+" ");
			Iterator<Integer> i = adjacencyList[vertex].listIterator();
			while(i.hasNext()){
				int nextVertex = i.next();
				if(!visited[nextVertex]){
					visited[nextVertex] = true;
					queue.add(nextVertex);
				}
			}
		}
	}

	// main function
	public static void main(String[] args){
		BFSGraph graph = new BFSGraph(5);

		graph.addEdge(0,1);
		graph.addEdge(0,3);
		graph.addEdge(1,0);
		graph.addEdge(1,2);
		graph.addEdge(2,2);
		graph.addEdge(2,4);
		graph.addEdge(3,4);
		graph.addEdge(4,4);
		graph.addEdge(4,1);
		graph.addEdge(4,0);

		graph.bfsDirectedGraph(1);
	}

}

/*

Time Complexty : 

Initialization -
Initializing the visited array takes O(n), where n is no of vertices.
Initializing the queue also takes O(1)

BFS Traversal - 
In worst case, each vertex and edge is processed once.
Each vertex is enqueued and dequeued exactly once.
the while loop iterates over each vertex, and the inner while loop iterates over all the adjacent  vertices.

therefore, the time complexity for traversing the graph using bfs is : O(V+E) where V is no. of vertices and E is no. of edges.

Space Compelexity : 

Space for the Graph - The adjacency list representation of the graph requires O(V+E) space. Each vertex has a list of its adjacent vertices (edges).

Space for the visited array - The visited array requires O(V) space to keep track of whether each vertex has been visited.

Space for the Queue - In the worst case, the queue might hold all the vertices in the graph, requiring O(V) space.

Space Complexity - O(V+E)
*/

