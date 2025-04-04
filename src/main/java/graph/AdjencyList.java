package graph;


import java.util.ArrayList;
import java.util.List;

public class AdjencyList {
    public static class Edge{
        int source;
        int destination;

        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i =0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,1));

    }

    public static void printNeighbourOfNode(ArrayList<Edge>[] graph,int nodeIndex){
        for(Edge edge : graph[nodeIndex]){
            System.out.println(edge.destination);
        }

    }


    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[4];
        createGraph(graph);
        printNeighbourOfNode(graph,1);
    }
}
