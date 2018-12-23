package tree.and.graph.test;

import org.junit.jupiter.api.Test;
import trees.and.graphs.model.GraphCreator;

/**
 * @author Abhijeet Gulve
 */
public class GrapthCreaterTest {
    @Test
    public void getDefaultGraphTest() {

        GraphCreator.printGraph( GraphCreator.getDefaultGraph());
    }

}
