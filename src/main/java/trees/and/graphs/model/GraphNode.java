package trees.and.graphs.model;

import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class GraphNode {
    private int data;
    private List<GraphNode> node;

    public GraphNode(int data) {
        this.data = data;
    }

    public void setNode(List<GraphNode> node) {
        this.node = node;
    }

    public GraphNode(int data, List<GraphNode> node) {
        this.data = data;
        this.node = node;
    }

    public int getData() {
        return data;
    }

    public List<GraphNode> getNode() {
        return node;
    }

}
