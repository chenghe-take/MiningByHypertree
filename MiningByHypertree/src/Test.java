import java.util.*;

public class Test {
    public static int MVC(Set<HyperEdge> hyperEdgeSet) {
        if (hyperEdgeSet == null || hyperEdgeSet.isEmpty()) {
            return 0;
        }

        // Map to keep track of the frequency of each vertex
        Map<Integer, Integer> vertexFrequency = new HashMap<>();
        for (HyperEdge edge : hyperEdgeSet) {
            for (Integer vertex : edge.getHyperEdge()) {
                vertexFrequency.put(vertex, vertexFrequency.getOrDefault(vertex, 0) + 1);
            }
        }

        // Priority queue to get the vertex with the highest frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue().compareTo(a.getValue())
        );
        pq.addAll(vertexFrequency.entrySet());

        Set<Integer> coverSet = new HashSet<>();
        Set<HyperEdge> uncoveredEdges = new HashSet<>(hyperEdgeSet);

        // Greedily add vertices to the cover set based on frequency
        while (!uncoveredEdges.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            if (entry == null) break;  // In case pq is empty

            Integer vertex = entry.getKey();
            coverSet.add(vertex);

            // Remove edges covered by this vertex
            uncoveredEdges.removeIf(edge -> edge.getHyperEdge().contains(vertex));
        }

        return coverSet.size();
    }

    public static void main(String[] args) {
        Set<HyperEdge> hyperEdgeSet = new HashSet<>();
        hyperEdgeSet.add(new HyperEdge(Arrays.asList(1, 2, 3)));
        hyperEdgeSet.add(new HyperEdge(Arrays.asList(1, 3, 4)));
        hyperEdgeSet.add(new HyperEdge(Arrays.asList(2, 3, 5)));

        System.out.println("MVC: " + MVC(hyperEdgeSet)); // Output should be 1 (vertex 3)
    }
}
