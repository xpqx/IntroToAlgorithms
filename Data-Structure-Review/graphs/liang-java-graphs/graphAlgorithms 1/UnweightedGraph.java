package liang.graphAlgorithms;

import java.util.*;


public class UnweightedGraph<V> implements Graph<V> {
	
	protected List<V> vertices = new ArrayList<>();
	protected List<List<Edge>> neighbors = new ArrayList<>();
	
	protected UnweightedGraph() {
		
	}
	
	protected UnweightedGraph(V[] vertices, int[][] edges) {
		for (int i = 0; i < vertices.length; i++)
			addVertex(vertices[i]);
		
		createAdjacencyLists(edges, vertices.length);
	}
	
	protected UnweightedGraph(List<V> vertices, List<Edge> edges) {
		for (int i = 0; i < vertices.size(); i++)
			addVertex(vertices.get(i));
		
		createAdjacencyLists(edges, vertices.size());
	}
	
	protected UnweightedGraph(List<Edge> edges, int numberOfVertices) {
		for(int i = 0; i < numberOfVertices; i++)
			addVertex((V)(new Integer(i)));
		
		createAdjacencyLists(edges, numberOfVertices);
	}
	
	
	protected UnweightedGraph(int[][] edges, int numberOfVertices) {
		for (int i = 0; i < numberOfVertices; i++)
			addVertex((V) (new Integer(i)));
		
		createAdjacencyLists(edges, numberOfVertices);
	}
	
	
	private void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
		for (Edge, edge:edges) {
			addEdge(edge.u, edge.v);
		}
	}
	
	public int getSize() {
		return vertices.size();
	}
	
	public List<V> getVertices(){
		return vertices;
	}
	
	public V getVertex(int index) {
		return vertices.get(index);
	}
	
	public int getIndex(V v) {
		return vertices.indexOf(v);
	}
	
	public List<Integer> getNeighbors(int index){
		List<Integer> result = new ArrayList<>();
		for (Edge e: neighbors.get(index))
			result.add(e.v);
		return result;
	}
	
	public int getDegree(int v) {
		return neighbors.get(v).size();
	}
	
	public void printEdges() {
		for (int u = 0; u < neighbors.size(); u++) {
			System.out.print(getVertex(u) + " (" + u + "): ");
			for (Edge e: neighbors.get(u)) {
				System.out.print("(" + getVertex(e.u) + ", " + getVertex(e.v) + ") ");
			}
			System.out.println();
			}
		}
	
	public void clear() {
		vertices.clear();
		neighbors.clear();
	}
	
	public boolean addVertex(V vertex) {
		if(!vertices.contains(vertex)) {
			vertices.add(vertex);
			neighbors.add(new ArrayList<Edge>());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean addEdge(Edge e) {
		if (e.u < 0 || e.u > getSize() -1) {
			throw new IllegalArgumentException("No such index: " + e.u);
			
		if (e.v < 0 || e.v > getSize() -1) {
			throw new IllegalArgumentException("No such index: " + e.v);
			
		if(!neighbors.get(e.u)contains(e)) {
			neighbors.get(e.u).add(e);
			return true;
		}
		else {
			return false;
		}
	}
		
		public boolean addEdge(int u, int v) {
			return addEdge(new Edge(u, v));
		}
		
		public SearchTree dfs(int v) {
			List<Integer> searchOrder = new ArrayList<>();
			int[] parent = new int[vertices.size()];
			for (int i = 0; i < parent.length; i++)
				parent[i] = -1;
			
			boolean[] isVisited = new boolean[vertices.size()];
			
			dfs(v, parent, searchOrder, isVisited);
			
			return new SearchTree(v, parent, searchOrder);
		}
		
		private void dfs(int v, int[] parent, List<Integer> searchOrder, boolean[] isVisited) {
			searchOrder.add(v);
			isVisited[v] = true;
			
			for (Edge e: neighbors.get(v)) {
				if(!isVisited[e.v]) {
					parent[e.v] = v;
					dfs(e.v, parent, searchOrder, isVisited);
				}
			}
		}
		
		public SearchTree bfs(int v) {
			List<Integer> searchOrder = new ArrayList<>();
			int[] parent = new int[vertices.size()];
			for(int i = 0; i < parent.length; i++)
				parent[i] = -1;
					
		java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
		boolean[] isVisited = new boolean[vertices.size()];
		queue.offer(v);
		isVisited[v] = true;
		
		while (!queue.isEmpty()) {
			int u = queue.poll();
			searchOrder.add(u);
			for (Edge e: neighbors.get(u)) {
				if (!isVisited[e.v]) {
					queue.offer(e.v);
					parent[e.v] = u;
					isVisited[e.v] = true;
				}
			}
		}
		return new SearchTree(v, parent, searchOrder);
		}

		@Override
		public boolean addEge(Edge e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(int u, int v) {
			// TODO Auto-generated method stub
			return true;
			}
		}
	}

}
