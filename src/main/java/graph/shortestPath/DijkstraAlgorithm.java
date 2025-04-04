package graph.shortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    public static int shortestPath( List<Edge>[] graph, int source,int target){
        int[] distance=new int[graph.length];
        boolean[] visited=new boolean[graph.length];
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->{
            return a.w -b.w;
        });
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source]=0;
        pq.add(new Edge(source,0,0));

        while (!pq.isEmpty()){
            Edge tempEdge=pq.poll();
            if(visited[tempEdge.u])continue;
            visited[tempEdge.u]=true;
            for(Edge e : graph[tempEdge.u]){
                if (distance[tempEdge.u] + e.w < distance[e.v]) {
                    distance[e.v]= distance[tempEdge.u] + e.w;
                    pq.add(new Edge(e.v,0,distance[tempEdge.v]));
                }
            }
        }

        for(int i =0;i<distance.length;i++){
            System.out.println(i +" -> "+distance[i]);
        }


        return 10;
    }

    public static void main(String[] args) {
        List<Edge>[] graph=new ArrayList[7];

        GraphGenerator.createGraph(graph);
        shortestPath(graph,0,6);

    }
}
