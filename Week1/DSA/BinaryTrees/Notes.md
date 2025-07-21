# Binary Tree
    -A binary tree is a hierarchical data structure
    -Each node has at most two children, referred to as the left child and the right child.

### Types of BT :

##### 1. Full Binary Tree:

    Every internal node has exactly two children, and all leaf nodes are at the same level.

##### 2. Complete Binary Tree:

    All levels are completely filled except possibly the last level, which is filled from left to right.

##### 3. Perfect Binary Tree:

    A binary tree that is both full and complete.

##### 4. Skewed Binary Tree:

    A binary tree where all nodes are either on the left side (left-skewed) or the right side (right-skewed).

### Terminologies in Binary Tree

* Nodes: The fundamental part of a binary tree, where each node contains data and link to two child nodes.
* Root: The topmost node in a tree is known as the root node. It has no parent and serves as the starting point for all nodes in the tree.
* Parent Node: A node that has one or more child nodes. In a binary tree, each node can have at most two children.
* Child Node: A node that is a descendant of another node (its parent).
* Leaf Node: A node that does not have any children or both children are null.
* Internal Node: A node that has at least one child. This includes all nodes except the leaf nodes.
* Depth of a Node: The number of edges from a specific node to the root node. The depth of the root node is zero.
* Height of a Binary Tree: The number of nodes from the deepest leaf node to the root node.

### Properties of Binary Tree

1. The maximum number of nodes at level L of a binary tree is 2L
2. The maximum number of nodes in a binary tree of height H is 2H – 1
3. Total number of leaf nodes in a binary tree = total number of nodes with 2 children + 1
4. In a Binary Tree with N nodes, the minimum possible height or the minimum number of levels is Log2(N+1)
5. A Binary Tree with L leaves has at least | Log2L |+ 1 levels