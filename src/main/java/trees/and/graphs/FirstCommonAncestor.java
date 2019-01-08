package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

import java.util.Set;

/**
 * @author Abhijeet Gulve
 * @see <a href="https://www.youtube.com/watch?v=13m9ZCB8gjw">getCommonAncestor</a>
 */
public class FirstCommonAncestor {
    public static Integer getCommonAncestor(TreeNode node, Set<Integer> nodes) {

        if (node == null) {
            return null;
        }
        if (nodes.contains(node.data)) {
            return node.data;
        } else {
            Integer commonAncestorLeft = getCommonAncestor(node.left, nodes);
            Integer commonAncestorRight = getCommonAncestor(node.right, nodes);
            if (commonAncestorLeft != null && commonAncestorRight != null) {
                return node.data;
            } else if (commonAncestorLeft != null) {
                return commonAncestorLeft;
            } else return commonAncestorRight;
        }
    }
}
