package liang.graphAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SearchTree {
	private int root;
	private int[] parent;
	private List<Integer> searchOrder;
	
	public SearchTree(int root, int[] parent, List<Integer> searchOrder) {
		this.root = root;
		this.parent = parent;
		this.searchOrder = searchOrder;
	}
	
	public int getRoot() {
		return root;
	}
	
	public int getParent(int v) {
		return parent[v];
	}
	
	public List<Integer> getSearchOrder(){
		return searchOrder;
	}
	
	public int getNumberOfVerticesFound() {
		return searchOrder.size();
	}
	
	public List<V> getPath(int index){
		ArrayList<V> path = new ArrayList<>();
		
		do {
			path.add(vertices.get(index));
			index = parent[index];
		}
		while(index != -1);
		
		return path;
	}
	
	public void printPath(int index) {
		List<V> path = getPath(index);
		System.out.print("A path from " + vertices.get(root) + " to " + vertices.get(index) + ": ");
		for (int i = path.size() - 1; i>= 0; i--)
			System.out.print(path.get(i) + " ");
	}
	
	public void printTree() {
		System.out.println("Root is: " + vertices.get(root));
		System.out.print("Edges: ");
		for (int i = 0; i < parent.length; i++) {
			if (parent[i] != -1) {
				System.out.print("(" + vertices.get(parent[i]) + ", " + 
			vertices.get(i) + ") ");
			}
		}
		System.out.println(); 
	}
		


public boolean remove(V v) {
	return true;
	}

public boolean remove(int u, int v) {
	return true;
	}
}