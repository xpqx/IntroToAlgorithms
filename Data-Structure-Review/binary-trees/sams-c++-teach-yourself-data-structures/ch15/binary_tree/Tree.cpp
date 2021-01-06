class Tree{
private:
	Node* pRoot;

public:
	Tree(): pRoot(NULL){}

	Node* find(int key){
		Node* pCurrent = pRoot;
		while (pCurrent -> iData != key){
			if (key < pCurrent -> iData)
				pCurrent = pCurrent -> pLeftChild;
			else
				pCurrent = pCurrent -> pRightChild;
			if (pCurrent == NULL)
				return NULL;
		}
		return pCurrent;
		}//end find(0)

	}

	void insert(int id, double dd){
		Node* pNewNode = new Node;
		pNewNode -> iData = id;
		pNewNode -> dData = dd;
		if (pRoot == NULL)
			pRoot = pNewNode;
		else {
			Node* pCurrent = pRoot;
			Node* pParent;
			while (true){
				pParent = pCurrent;
				if (id < pCurrent -> iData){
					pCurrent = pCurrent -> pLeftChild;
					if (pCurrent == NULL){
						pParent -> pLeftChild = pNewNode;
						return;
					}
				}
				else {
					pCurrent = pCurrent -> pRightChild;
					if(pCurrent == NULL){
						pParent -> pRightChild = pNewNode;
						return;
					}
				}
			}
		}
}//end insert()

	void traverse(int traverseType){

	}

	void displayTree(){

	}

