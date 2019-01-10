package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

/**
 * @author Abhijeet Gulve
 */
public class TreeMock {
    public static TreeNode getTreeNode() {
        /* Constructed binary tree is
             10
            /  \
          8     20
         /
        3
        */
        TreeNode treeNode = new TreeNode(10);
        TreeNode left1 = new TreeNode(8);
        TreeNode right1 = new TreeNode(20);
        treeNode.left = left1;
        treeNode.right = right1;
        return treeNode;
    }

    public static TreeNode getTreeNodeUnbalance() {
        TreeNode treeNode = getTreeNode();
        TreeNode left = new TreeNode(1);
        treeNode.left.left = left;
        TreeNode leftLeft = new TreeNode(45);
        leftLeft.left = new TreeNode(44);
        left.left = leftLeft;
        return treeNode;
    }

    public static TreeNode getTreeNodeAncestor() {
        /* Constructed binary tree is
             10
            /  \
          8     20
        */
        TreeNode treeNode = new TreeNode(10);
        TreeNode left10 = new TreeNode(8);
        TreeNode right10 = new TreeNode(20);
        treeNode.left = left10;
        treeNode.right = right10;
        left10.left = new TreeNode(3);
        left10.left.left = new TreeNode(9);

        return treeNode;
    }
}
