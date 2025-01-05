package Graphs.bfs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class GraphsCreation {
    public static void addEdge(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public static void printGraph(List<List<Integer>> adj) {
        for(int i=0; i<adj.size(); i++) {
            for(int x : adj.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(List<List<Integer>> adj, int v, int start) {
        boolean vis[] = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
//        for(int i=0; i<v; i++) {
//            System.out.println(vis[i]);
//        }
        vis[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " -> ");
            for(int x : adj.get(cur)) {
                if (vis[x] == false) {
                    vis[x] = true;
                    queue.add(x);
                }
            }
        }


    }
    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> adj = new ArrayList<>(v);

        for(int  i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);

        printGraph(adj);
        bfs(adj, v, 0);

    }
}
