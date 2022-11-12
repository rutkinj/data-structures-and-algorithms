# Trees

## Challenge
Implement the classes Node, BinaryTree and BinarySearchTree. Create methods for adding nodes, checking if values are present, as well as implementing the following depth first traversals: Pre-order, In-order, and Post-order.

## API
### Binary Tree
`preorder()` traverses the tree from root >> left >> right and returns the traversal as an array of values

`inorder()` traverses the tree from left >> root >> right and returns the traversal as an array of values

`postorder()` traverses the tree from left >> right >> root and returns the traversal as an array of values

### Binary Sort Tree
`add(Integer value)` creates a node with `value` and places that node in the appropriate location within the tree according to a binary sort. If the value is already present, no change is made.

`contains(Integer value)` performs a binary search, looking for a node that contains `value`. returns a boolean based on result.

