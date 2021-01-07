Depth-First Search Algorithm

Input: G = (V, E) and a starting vertex v
Output: a DFS tree rooted at v

SearchTree dfs(vertex v){
	visit v;
	for each neighbor w of v
	if (w has not been visited){
	set v as the parent for w in the tree;
	dfs(w);
	}
}


