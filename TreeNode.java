// TreeNode class
class TreeNode {
    String data;
    TreeNode left, right;

    TreeNode(String data) {
        this.data = data;
        left = right = null;
    }
}

public class PostOrderTraversal {

    // Post-order traversal: Left → Right → Root
    public static void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + ", ");
    }

    public static void main(String[] args) {
        // Create nodes
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");

        // Build tree structure
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        // Perform post-order traversal
        postOrder(root);
    }
}
