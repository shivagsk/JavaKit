package trees;


class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}


public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.right = new TreeNode(40);
        root.right.left = new TreeNode(50);
        root.right.left.right = new TreeNode(60);

        System.out.println(maxDepthofTree(root));
    }
    public static int maxDepthofTree(TreeNode root) {
        if (root == null)
            return 0;
//        if(root.left == null && root.right == null)
//            return 1; // not necessary to have this condition
        int l = maxDepthofTree(root.left);
        int r = maxDepthofTree(root.right);
        return l>r ? 1 + l : 1+r;
    }
}
