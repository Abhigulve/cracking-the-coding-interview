package trees.and.graphs;

import java.util.*;

/**
 * @author Abhijeet Gulve
 */
public class GraphTraversal {

    public static void BFS(Map<Integer, List<Integer>> graph) {
        Map<Integer, Boolean> isVisited = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>();
        Map.Entry<Integer, List<Integer>> next = graph.entrySet().iterator().next();
        queue.add(next.getKey());
        isVisited.put(next.getKey(), true);
        while (!queue.isEmpty()) {
            int ele = queue.poll();
            List<Integer> val = graph.get(ele);
            System.out.println(ele);
            for (int ele1 : val) {
                if (!isVisited.containsKey(ele1)) {
                    isVisited.put(ele1, true);
                    queue.add(ele1);
                }
            }
        }
    }


    public static void DFS(Map<Integer, List<Integer>> graph, int ele, Map<Integer, Boolean> isVisited) {
        if (isVisited.containsKey(ele)) {
            return;
        }
        System.out.println(ele);
        isVisited.put(ele, true);
        for (int i = 0; i < graph.get(ele).size(); i++) {
            DFS(graph, graph.get(ele).get(i), isVisited);
        }
    }

    public static boolean BFSForFIndThePathBetweenTwoNodes(Map<Integer, List<Integer>> graph, int u, int v) {
        Map<Integer, Boolean> isVisited = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(u);
        isVisited.put(u, true);
        while (!queue.isEmpty()) {
            int ele = queue.poll();
            if (ele == v) {
                return true;
            }
            List<Integer> val = graph.get(ele);
            for (int element : val) {
                if (!isVisited.containsKey(element)) {
                    isVisited.put(element, true);
                    queue.add(element);
                }
            }
        }
        return false;
    }


}

























