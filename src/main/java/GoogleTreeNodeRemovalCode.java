import trees.and.graphs.TreeMock;
import trees.and.graphs.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class GoogleTreeNodeRemovalCode {

    public static void main(String[] args) {
        TreeNode treeNodeAncestor = TreeMock.getTreeNodeAncestor();
        List<TreeNode> list = new ArrayList<>();
        getNextNode(treeNodeAncestor, list, false);
        System.out.println(list);
    }

    public static boolean isPartOfTree(TreeNode node) {
        if (node.data == 13 || node.data == 2 || node.data == 8)
            return true;
        else return false;
    }

    public static boolean getNextNode(TreeNode node, List<TreeNode> list, boolean parentBreak) {
        if (node == null) {
            return false;
        }
        if (isPartOfTree(node)) {
            getNextNode(node.right, list, true);
            getNextNode(node.left, list, true);
            return true;
        } else if (getNextNode(node.right, list, false) || getNextNode(node.left, list, false) || parentBreak) {
            list.add(node);
        }
        return false;
    }

}
