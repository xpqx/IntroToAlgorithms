int main(){
	Tree theTree;

	theTree.insert(50, 1.5);
	theTree.insert(25, 1.7);
	theTree.insert(75, 1.9);

	Node* found = theTree.find(25);
	if (found != NULL)
		cout << "Found the node with key 25" << endl;
	else
		cout << "Could not find node with key 25" << endl;
	return 0;
}