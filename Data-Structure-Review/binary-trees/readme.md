# Binary Trees Review

- Binary trees are fundamental data structures that provide some advantages that arrays and linked list cannot.
- Binary trees provide the benefits provided by Linked List such as quick insertions and deletions while also providing quick searching of an array.
- Trees are actually instances of a more general structure called a graph. Thus, trees are a type of graph.
- Binary trees are a specialized form of a tree. Each node in a binary tree has two children.


# Tree Terminology

- __path:__ Traversing, that is, walking from node to node along the edges that connect them. The sequence of nodes that are traversed is called a path. The nodes can also be considered edges or vertices.

- __root:__ The node, that is, the edge at the top of the tree, can be considered the root. Each tree only has one root.

- __parent:__ Any node, except the root note, has exactly one edge (path), running upward to another node. The node above it, is called the parent of the node.

- __child:__ Any node can have one or more lines running downward to other nodes. These nodes below a given node are called its children.

- __leaf:__ A node that has no children is called a lead node or simply a leaf. There can be only one root in a tree, but a tree can have many leaves.

- __subtree:__ Any node can be considered to be the root of a subtree, which consists of its children, and its children's children, and so on. If you think in terms of families, a node's substree contains all its descendants.

- __visiting:__ A node is visited when program control arrives at the node, usually for the purpose of carrying out some operation on the node, such as checking the value of one of its data members, or displaying it. The act of just passing over a node on the path from one node to another is not considered to be visiting the node.

- __traversing:__ To traverse a tree means to visit all the nodes in some specified order. One example of traversing is visiting all the nodes in order of ascending key value. There are other ways to traverse a tree, as we'll see in the next hour.

- __levels:__ The level of a particular node refers to how many generations the node is from the root. If we assume the root is Level 0, its children will be Level 1, its grand children will be Level 2, and so on.

- __keys:__ We've seen that one data item in an object is usually designated a key value. This value is used to search for the item or perform the item or perform other operations on it. In tree diagrams, when a circle represents a node holding a data item, the key value of the item is typically shown in the circle.

- __Binary Trees:__ If every node in a tree can have at most two children, the tree is called a binary tree.
