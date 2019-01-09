package trees.and.graphs.model;

/**
 * @author Abhijeet Gulve
 */
public class TreeNode {

    public TreeNode left;
    public TreeNode right;
    public int data;

    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }
}
