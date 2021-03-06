public class LCA {
    // Defining a node in a binary tree

    public static Node lowestCommonAncestor(Node node1, Node node2, Node root)
    {
        if (root == null) return null;
        // If one of the nodes has been found (i.e. is root), return root
        if (node1 == root || node2 == root) return root;

        // Traverse tree from left and right to look for nodes
        Node leftLCA = lowestCommonAncestor(node1, node2, root.getLeft());
        Node rightLCA = lowestCommonAncestor(node1, node2, root.getRight());

        // If node1 and node2 are both found in subtrees of root, then root is the LCA.
        if (leftLCA != null && rightLCA != null) return root;

        // Else... return either left or right if the other is not found.
        if (leftLCA == null)
            return rightLCA;
        else
            return leftLCA;
    }
}
