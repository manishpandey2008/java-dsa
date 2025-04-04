package graph.shortestPath;

import java.util.ArrayList;
import java.util.List;

public class GraphGenerator {
    public static void createGraph(List<Edge>[] graph){
        /*
                1 -3- 3
             /2       |  \5
            0        |6    5 -8--6
             \4      |   /9
                2 -6- 4  /
         */

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,0,2));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,0,4));
        graph[2].add(new Edge(2,4,6));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,4,6));
        graph[3].add(new Edge(3,5,5));

        graph[4].add(new Edge(4,2,6));
        graph[4].add(new Edge(4,3,6));
        graph[4].add(new Edge(4,5,9));

        graph[5].add(new Edge(5,3,5));
        graph[5].add(new Edge(5,4,9));
        graph[5].add(new Edge(5,6,8));

    }

    public static void createGraphUnWeighted(List<Edge>[] graph){
        /*
                1 -1- 3
             /1       |  \1
            0        |1    5 -1--6
             \1      |   /1
                2 -1- 4  /
         */

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

    }


//    public static void main(String[] args) {
//
//
//        List<Edge>[] graph=new ArrayList[7];
//        for(List<Edge> edges:graph){
//            edges=new ArrayList<>();
//        }
//
//        createGraph(graph);
//    }
}
