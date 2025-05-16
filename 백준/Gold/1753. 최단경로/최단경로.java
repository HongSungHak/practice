import java.util.*;

class Node implements Comparable<Node> {
    int index;
    int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return this.distance - other.distance;
    }
}

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static List<Node>[] graph;
    static int[] dist;

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int now = current.index;

            if (dist[now] < current.distance) continue;

            for (Node next : graph[now]) {
                int cost = dist[now] + next.distance;

                if (cost < dist[next.index]) {
                    dist[next.index] = cost;
                    pq.offer(new Node(next.index, cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();  // 정점 수
        int E = sc.nextInt();  // 간선 수
        int K = sc.nextInt();  // 시작 정점

        graph = new ArrayList[V + 1];
        dist = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = INF;
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u].add(new Node(v, w));
        }

        dijkstra(K);

        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }

        sc.close();
    }
}
