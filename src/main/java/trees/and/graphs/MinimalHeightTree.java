package trees.and.graphs;


import trees.and.graphs.model.TreeNode;

/**
 * @author Abhijeet Gulve
 */
public class MinimalHeightTree {
    public static void main(String[] args) {
        int[] array =
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                };
        TreeNode bst = createBST(array, 0, 9);
        System.out.println(bst);

    }

    public static TreeNode createBST(int[] array, int i, int j) {
        if (i > j) {
            return null;
        }
        int middle =( i + j) / 2;
        TreeNode treeNode = new TreeNode(array[middle]);
        treeNode.left = createBST(array, i, middle - 1);
        treeNode.right = createBST(array, middle+1, j);
        return treeNode;
    }
}
