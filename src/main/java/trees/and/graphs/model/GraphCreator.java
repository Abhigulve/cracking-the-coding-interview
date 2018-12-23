package trees.and.graphs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class GraphCreator {
    public static GraphNode getDefaultGraph() {
        GraphNode node5 = new GraphNode(5);
        List<GraphNode> node5Childs = new ArrayList<GraphNode>();
        node5.setNode(node5Childs);
        GraphNode node4 = new GraphNode(4);
        List<GraphNode> node4Childs = new ArrayList<GraphNode>();
        node4Childs.add(node5);
        node4.setNode(node4Childs);
        GraphNode node3 = new GraphNode(3, new ArrayList<GraphNode>());
        List<GraphNode> node3Childs = new ArrayList<GraphNode>();
        node3.setNode(node3Childs);
        node4Childs.add(node3);
        List<GraphNode> connectedNodesOf2 = new ArrayList<GraphNode>();
        connectedNodesOf2.add(node3);
        connectedNodesOf2.add(node5);
        node5Childs.add(node3);
        node5Childs.add(node4);

        GraphNode node2 = new GraphNode(2, connectedNodesOf2);
        node5Childs.add(node2);
        List<GraphNode> connectedNodesOf1 = new ArrayList<GraphNode>();
        connectedNodesOf1.add(node2);
        connectedNodesOf1.add(node3);

        GraphNode node1 = new GraphNode(1, connectedNodesOf1);
        connectedNodesOf2.add(node1);
        node3Childs.add(node1);
        node3Childs.add(node2);
        node3Childs.add(node5);
        node3Childs.add(node4);
        return node1;
    }

}
