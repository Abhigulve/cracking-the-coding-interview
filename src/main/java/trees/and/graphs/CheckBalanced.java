package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

/**
 * @author Abhijeet Gulve
 */
public class CheckBalanced {
    public static void main(String[] args) {
        TreeNode treeNode = TreeMock.getTreeNode();
        System.out.println(isBalance(treeNode));
    }

    static boolean isBalance(TreeNode node) {
        if (node == null) {
            return true;
        }
        int ll = height(node.left);
        int rr = height(node.right);
        if ((ll - rr <= 1) && isBalance(node.left) && isBalance(node.right)) {
            return true;
        }
        return false;
    }

    static int height(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }


}
