package Graphs.bfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DisconnectedGraphBfs {
    public static void addEdge(List<List<Integer>> adj,  int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
    public static void printAdj(List<List<Integer>> adj) {
        for(int i=0; i<adj.size(); i++) {
            for(int x:adj.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void bfsDisconnected(List<List<Integer>> adj) {
        boolean[] vis = new boolean[adj.size()];
        int count = 0;
        for(int i=0; i<adj.size(); i++) {
            if(vis[i] == false) {
                bfs(adj, i, vis);
                count +=1;
            }
        }
        System.out.println("No. of Disconnected Graphs is : " + count);
    }

    public static void bfs(List<List<Integer>> adj, int s, boolean[] vis) {
        Queue<Integer> queue = new LinkedList<>();

        vis[s] = true;
        queue.add(s);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + "->");
            for(int x: adj.get(cur)) {
                if(vis[x] == false) {
                    vis[x] = true;
                    queue.add(x);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int v = 6;
        List<List<Integer>> adj = new ArrayList<>(v);

        for(int i=0; i<v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        printAdj(adj);

        bfsDisconnected(adj);



    }
}
