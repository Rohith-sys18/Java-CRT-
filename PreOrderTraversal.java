// TreeNode class definition
class TreeNode {
    String data;
    TreeNode left, right;

    TreeNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderTraversal {

    // Pre-order traversal: Root → Left → Right
    public static void preOrder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        // Create tree nodes
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");

        // Build the tree
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        // Call pre-order traversal
        preOrder(root);
    }
}
