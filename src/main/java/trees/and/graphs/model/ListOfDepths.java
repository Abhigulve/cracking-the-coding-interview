package trees.and.graphs.model;

import sun.reflect.generics.tree.Tree;

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
        if (resList.size() < level+1) {
            resList.add(level, new LinkedList());
        }
        resList.get(level).add(node);
        getListOfDepth(node.left, level + 1, resList);
        getListOfDepth(node.right, level + 1, resList);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        TreeNode left1 = new TreeNode(8);
        TreeNode right1 = new TreeNode(2);
        treeNode.left = left1;
        treeNode.right = right1;
        left1.left = new TreeNode(3);
        /* Constructed binary tree is
             10
            /  \
          8     2
         /
        3
        */
        List<LinkedList<TreeNode>> resList = new ArrayList<>();
        getListOfDepth(treeNode, 0, resList);
        System.out.println(resList.get(1).get(0).data);
        System.out.println(resList.get(1).get(1).data);
        System.out.println(resList.get(2).get(0).data);
    }
}
