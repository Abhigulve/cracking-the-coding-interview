package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

/**
 * @author Abhijeet Gulve
 */
public class ValidateBST {
    static int lastPrinted = 0;

    public static void main(String[] args) {
        System.out.println(isValidBST(TreeMock.getTreeNode()));
    }

    public static boolean isValidBST(TreeNode node) {
        if (node == null) return true;
        if (!isValidBST(node.left)) return false;
        if (lastPrinted != 0 && node.data <= lastPrinted) {
            return false;
        }
        lastPrinted = node.data;
        if (!isValidBST(node.right)) {
            return false;
        }
        return true;
    }
}
