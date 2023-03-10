import java.util.*;

public class minCost {

    public static int mincost(int[][] graph, int[] parent, int n) {
        // Create a priority queue to store the edges of the graph.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // Create an array to store the minimum weight of edges that connect each vertex to the MST.
        int[] key = new int[n];

        // Initialize the arrays.
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        // Add the first vertex to the MST and set its key to 0.
        key[0] = 0;
        pq.add(new int[]{0, 0});

        // Loop until all vertices are added to the MST.
        while (!pq.isEmpty()) {

            // Get the vertex with the smallest key that is not in the MST.
            int u = pq.poll()[0];

            // Add u to the MST.
            for (int v = 0; v < n; v++) {
                // Check if v is adjacent to u and not in the MST.
                if (graph[u][v] != 0 && key[v] > graph[u][v] && parent[u] != v) {
                    // Update the key of v and its parent in the MST.
                    key[v] = graph[u][v];
                    parent[v] = u;
                    pq.add(new int[]{v, key[v]});
                }
            }
        }

        // Calculate the sum of weights of the edges in the MST.
        int mstWeight = 0;
        for (int i = 1; i < n; i++) {
            mstWeight += graph[i][parent[i]];
        }

        return mstWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of localities
        System.out.print("Enter the number of localities in the city -> ");
        int n = scanner.nextInt();

        // Create an adjacency matrix to represent the graph
        int[][] graph = new int[n][n];

        // Prompt user for the cost of repairing each road
        System.out.println("\n################### Enter the cost of repairing the roads between each locality ###################");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Prompt user for the cost of repairing the road between locality i and locality j
                System.out.printf("Cost from locality %d to locality %d: ", i + 1, j + 1);
                int cost = scanner.nextInt();

                // Set the cost of repairing the road between locality i and locality j in the graph
                graph[i][j] = cost;
                graph[j][i] = cost; // since the graph is undirected
            }
        }

        // Print the adjacency matrix for the graph
        System.out.println("\n#################### The Adjacency Matrix of the graph looks like ####################");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        // Create an array to store the parent of each vertex in the MST.
        int[] parent = new int[n];

        int cost = mincost(graph, parent, n);

        System.out.println("\nMinimum Cost of repairing the roads are ->  " + cost + " lakhs");

        System.out.println("\nFollowing are the localities in between which the roads should be repaired to maintain the connectivity at minimum repairing cost of " + cost + " lakhs");
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                continue;
            }
            System.out.println("Locality " + (parent[i] + 1) + " <-> Locality " + (i + 1));
        }
    }
}