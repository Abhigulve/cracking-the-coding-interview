package tree.and.graph.test;

import org.junit.jupiter.api.Test;
import trees.and.graphs.model.GraphCreator;
import trees.and.graphs.model.GraphTraversal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Abhijeet Gulve
 */
public class GraphTraversalTest {
    @Test
    public void bfsTest() {
        GraphTraversal.BFS(GraphCreator.getDefaultGraph());
    }

    @Test
    public void dfsTest() {
        Map<Integer, Boolean> isVisited = new HashMap<>();

        GraphTraversal.DFS(GraphCreator.getDefaultGraph(), 1, isVisited);
    }

    @Test
    public void BFSForFIndThePathBetweenTwoNodesTest() {
        Map<Integer, Boolean> isVisited = new HashMap<>();
        System.out.println(GraphTraversal.BFSForFIndThePathBetweenTwoNodes(GraphCreator.getDefaultGraph(), 1, 7));
    }

    @Test
    public void BFSForFIndThePathBetweenTwoNodesTest1() {
        Map<Integer, Boolean> isVisited = new HashMap<>();
        System.out.println(GraphTraversal.BFSForFIndThePathBetweenTwoNodes(GraphCreator.getDefaultGraph(), 1, 5));
    }

}
