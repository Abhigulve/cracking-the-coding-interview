package trees.and.graphs.model;

import java.util.*;

/**
 * @author Abhijeet Gulve
 */
public class GraphCreator {
    public static Map<Integer, List<Integer>> getDefaultGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        graph.put(1, list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        graph.put(2, list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        graph.put(3, list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(5);
        graph.put(4, list4);
        List<Integer> list5 = new ArrayList<>();
        list5.add(4);
        list5.add(2);
        list5.add(3);
        graph.put(5, list5);
        return graph;
    }

    public static void printGraph(Map<Integer, List<Integer>> graph) {
        graph.forEach((k, v) -> {
            System.out.print(k + "  ");
            v.forEach(t -> System.out.print(t + "  "));
            System.out.println();
        });
    }
}
