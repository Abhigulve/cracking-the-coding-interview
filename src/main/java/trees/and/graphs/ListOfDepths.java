package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class ListOfDepths {

    public static void getListOfDepth(TreeNode node, int level, List<LinkedList<TreeNode>> resList) {
        if (node == null) {
            return;
        }
        if (resList.size() == level) {
            resList.add(level, new LinkedList<>());
        }
        resList.get(level).add(node);
        getListOfDepth(node.left, level + 1, resList);
        getListOfDepth(node.right, level + 1, resList);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeMock.getTreeNode();
        List<LinkedList<TreeNode>> resList = new ArrayList<>();
        getListOfDepth(treeNode, 0, resList);
        System.out.println(resList.get(1).get(0).data);
        System.out.println(resList.get(1).get(1).data);
        System.out.println(resList.get(2).get(0).data);
    }
}
