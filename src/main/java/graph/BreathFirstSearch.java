package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreathFirstSearch {

    public static class Edge{
        int source;
        int destination;

        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }

    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));


        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

        graph[7].add(new Edge(7,8));
        graph[7].add(new Edge(7,9));

        graph[8].add(new Edge(8,7));

        graph[9].add(new Edge(9,10));
        graph[9].add(new Edge(9,7));

        graph[10].add(new Edge(10,9));

    }

    public static void printBsf(ArrayList<Edge>[] graph,boolean[] visited,int start){
        System.out.println("=====================");
        Queue<Integer> queue= new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int currentIndex=queue.poll();
            if(!visited[currentIndex]){
                visited[currentIndex]=true;
                System.out.println(currentIndex);
                for(Edge edge : graph[currentIndex]){
                    queue.add(edge.destination);
                }
            }
        }
     }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[11];

        /*
                1 -- 3
             /       |  \
            0        |     5 ---6
             \       |   /
                2 -- 4  /

               7 ---- 8
                \
                  9 --- 10
         */

        createGraph(graph);


        boolean[] visited=new boolean[11];

        for (int i=0;i<visited.length;i++){
            if(!visited[i]){
                printBsf(graph,visited,i);
            }
        }

    }
}
