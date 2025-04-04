package graph.shortestPath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathInAnUnweightedGraphBFS {

    private static void shortestPath(List<Edge>[] graph, int source,int destination){
        Queue<Edge> queue=new LinkedList<>();
        queue.add(new Edge(0,0,1));
        String res="";
        boolean[] visited=new boolean[graph.length];
        while (!queue.isEmpty()){
            Edge edge = queue.poll();
            visited[edge.u]=true;
            for(Edge e : graph[edge.u]){
                if(!visited[edge.u]){
                    queue.add(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Edge>[] graph=new ArrayList[7];

        GraphGenerator.createGraphUnWeighted(graph);
        shortestPath(graph,0,6);
    }
}
