package tree.and.graph.test;

import org.junit.jupiter.api.Test;
import trees.and.graphs.FirstCommonAncestor;
import trees.and.graphs.TreeMock;
import trees.and.graphs.model.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Abhijeet Gulve
 *
 */
public class FirstCommonAncestorTest {
    @Test
    public void test() {
        TreeNode treeNode = TreeMock.getTreeNodeAncestor();
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 20));
        System.out.println(FirstCommonAncestor.getCommonAncestor(treeNode, set));
    }

    @Test
    public void test1() {
        TreeNode treeNode = TreeMock.getTreeNodeAncestor();
        Set<Integer> set = new HashSet<>(Arrays.asList(8, 3));
        System.out.println(FirstCommonAncestor.getCommonAncestor(treeNode, set));
    }
}
