public class InOrder {

    // TreeNode class
    static class TreeNode {
        String data;
        TreeNode left, right;

        TreeNode(String data) {
            this.data = data;
            left = right = null;
        }
    }

    // In-order traversal method
    public static void inOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.data + ", ");
        inOrderTraversal(node.right);
    }

    // Main method
    public static void main(String[] args) {
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");

        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        // Call inOrder traversal
        inOrderTraversal(root);
    }
}
