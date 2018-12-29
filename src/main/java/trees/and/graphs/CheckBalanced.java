package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

/**
 * @author Abhijeet Gulve
 */
public class CheckBalanced {
    public static void main(String[] args) {
        TreeNode balance = TreeMock.getTreeNode();
//        System.out.println(isBalance(balance));
        TreeNode treeNodeUnbalance = TreeMock.getTreeNodeUnbalance();
        System.out.println(isBalanceInHeight(treeNodeUnbalance)!=Integer.MIN_VALUE);
        System.out.println(isBalanceInHeight(balance)!=Integer.MIN_VALUE);

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


    static int isBalanceInHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int rightHeight = isBalanceInHeight(node.right);
        int leftHeight = isBalanceInHeight(node.left);
        if (rightHeight == Integer.MIN_VALUE || leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {

//            System.out.println("At node " + node.data + " left value is " + leftHeight + " and right Height " + rightHeight);
            if ((Math.abs(rightHeight - leftHeight)) > 1) {
                return Integer.MIN_VALUE;
            } else {
                return (Math.abs(rightHeight - leftHeight)) + 1;
            }
        }
    }

}
