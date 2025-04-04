package graph.shortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFordAlgo {

    private static void shortestPath(List<Edge>[] graph,int source, int target){
        int[] distance=new int[graph.length];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source]=0;
        for(int i=0;i<graph.length-1;i++){
            for(List<Edge> g:graph){
                for (Edge e: g){
                    if(distance[e.u]!=Integer.MAX_VALUE && (distance[e.u]+e.w)<distance[e.v]){
                        distance[e.v]= distance[e.u]+e.w;
                    }
                }
            }
        }

        for(int i =0;i<distance.length;i++){
            System.out.println(i +" -> "+distance[i]);
        }

    }

    public static void main(String[] args) {
        List<Edge>[] graph=new ArrayList[7];

        GraphGenerator.createGraph(graph);
        shortestPath(graph,0,6);
    }
}
