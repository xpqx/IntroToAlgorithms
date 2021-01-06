class Node{
public:
	int iData;
	double dData;
	Node* pLeftChild;
	Node* pRightChild;

	Node(): iData(0), dData(0.0), pLeftChild(NULL), pRightChild(NULL){

	}

void displayNode(){
	cout << "{" << iData << ", " << dData << "}";
 }
};//end class node