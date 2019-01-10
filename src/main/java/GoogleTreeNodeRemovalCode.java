import trees.and.graphs.TreeMock;
import trees.and.graphs.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class GoogleTreeNodeRemovalCode {

    /**
     * Question
     * <p>
     * 10
     * /   \
     * 20    3
     * /
     * 4
     * <p>
     * Let say i'm having one method that will return me true or false based on we need to put that node in our tree or not.
     *
     * <p>
     * If it has return me true then that node been removed from tree and remaining tree will break in to multiple trees
     * <p>
     * Ex.
     * Let's consider above tree and our method returns true for 20 then result will be having two trees
     * 1 is 4 and remaining is of 10. These are became root node of tree
     * </p>
     *
     * </p>
     */


    public static void main(String[] args) {
        TreeNode treeNodeAncestor = TreeMock.getTreeNodeAncestor();
        List<TreeNode> list = new ArrayList<>();
        getNextNode(treeNodeAncestor, list, false, true);
        System.out.println(list);
    }

    public static boolean isPartOfTree(TreeNode node) {
        if (node.data == 13 || node.data == 2 || node.data == 18)
            return true;
        else return false;
    }

    public static boolean getNextNode(TreeNode node, List<TreeNode> list, boolean parentBreak, boolean isRoot) {
        if (node == null) {
            return false;
        }
        if (isPartOfTree(node)) {
            getNextNode(node.right, list, true, false);
            getNextNode(node.left, list, true, false);
            return true;
        } else if (getNextNode(node.right, list, false, false) || getNextNode(node.left, list, false, false) || parentBreak || isRoot) {
            if (parentBreak) {
                list.add(node);
                return true;
            }else if(isRoot){
                list.add(node);
            }
        }
        return false;
    }
}
