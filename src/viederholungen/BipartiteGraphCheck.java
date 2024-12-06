package viederholungen;

import java.util.*;

public class BipartiteGraphCheck {

    public static boolean isBipartite(Map<Integer, List<Integer>> graph) {
        // Map to store the marking of each node (0 or 1)
        Map<Integer, Integer> markings = new HashMap<>();
        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Iterate through all nodes (to handle disconnected graphs)
        for (int node : graph.keySet()) {
            if (!markings.containsKey(node)) {
                // Mark the starting node with 0
                markings.put(node, 0);
                queue.add(node);

                // BFS
                while (!queue.isEmpty()) {
                    int current = queue.poll();
                    // Get neighbors of the current node
                    for (int neighbor : graph.get(current)) {
                        if (!markings.containsKey(neighbor)) {
                            // Mark the neighbor with a different value
                            markings.put(neighbor, 1 - markings.get(current));
                            queue.add(neighbor);
                        } else if (markings.get(neighbor).equals(markings.get(current))) {
                            // If the neighbor has the same marking, the graph is not bipartite
                            return false;
                        }
                    }
                }
            }
        }
        // All nodes were successfully marked, so the graph is bipartite
        return true;
    }

    public static void main(String[] args) {
        // Example graph as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(0, 2));
        graph.put(2, Arrays.asList(1, 3));
        graph.put(3, Arrays.asList(0, 2));

        // Check if the graph is bipartite
        boolean result = isBipartite(graph);
        System.out.println("Is the graph bipartite? " + result);
    }
}
