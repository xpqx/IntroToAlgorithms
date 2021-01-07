Input: G = (V, E) and a starting vertex v
Output: a BFS tree rooted at v

SearchTree bfs(vertex v){
	create an empty queue for storing vertices to be visited;
	add v into the queue;
	mark v visited;

	while (the queue is not empty){
	dequeue a vertex, say u, from the queue;
	add u into a list of traversed vertices;
	for each neighbor w of u
		if w has not been visited{
		add w into the queue;
		set u as the parent for w in the tree;
		mark w visited;
		}
	}
}