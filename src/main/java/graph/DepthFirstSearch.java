package graph;

import java.util.ArrayList;

public class DepthFirstSearch {
    public static void createGraph(ArrayList<BreathFirstSearch.Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new BreathFirstSearch.Edge(0,1));
        graph[0].add(new BreathFirstSearch.Edge(0,2));

        graph[1].add(new BreathFirstSearch.Edge(1,0));
        graph[1].add(new BreathFirstSearch.Edge(1,3));


        graph[2].add(new BreathFirstSearch.Edge(2,0));
        graph[2].add(new BreathFirstSearch.Edge(2,4));

        graph[3].add(new BreathFirstSearch.Edge(3,1));
        graph[3].add(new BreathFirstSearch.Edge(3,4));
        graph[3].add(new BreathFirstSearch.Edge(3,5));

        graph[4].add(new BreathFirstSearch.Edge(4,2));
        graph[4].add(new BreathFirstSearch.Edge(4,3));
        graph[4].add(new BreathFirstSearch.Edge(4,5));

        graph[5].add(new BreathFirstSearch.Edge(5,3));
        graph[5].add(new BreathFirstSearch.Edge(5,4));
        graph[5].add(new BreathFirstSearch.Edge(5,6));

        graph[6].add(new BreathFirstSearch.Edge(6,5));

//        graph[7].add(new BreathFirstSearch.Edge(7,8));
//        graph[7].add(new BreathFirstSearch.Edge(7,9));
//
//        graph[8].add(new BreathFirstSearch.Edge(8,7));
//
//        graph[9].add(new BreathFirstSearch.Edge(9,10));
//        graph[9].add(new BreathFirstSearch.Edge(9,7));
//
//        graph[10].add(new BreathFirstSearch.Edge(10,9));

    }

    public static void printDsf(ArrayList<BreathFirstSearch.Edge>[] graph,boolean[] visited,int start){
        if(visited[start])return;
        visited[start]=true;
        System.out.println(start);
        for(BreathFirstSearch.Edge edge: graph[start]){
            printDsf(graph,visited,edge.destination);
        }
    }


    public static void printPathBetweenSrcToDes(ArrayList<BreathFirstSearch.Edge>[] graph,boolean[] visited,int start,String path){
        if(start==5){
            System.out.println(path);
            return;
        }
        for(BreathFirstSearch.Edge edge: graph[start]){
            if(!visited[edge.destination]){
                visited[start]=true;
                printPathBetweenSrcToDes(graph,visited,edge.destination,path+ edge.destination);
                visited[start]=false;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<BreathFirstSearch.Edge>[] graph=new ArrayList[7];

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

        boolean[] visited=new boolean[7];

//        for (int i=0;i<visited.length;i++){
//            if(!visited[i]){
//                printDsf(graph,visited,i);
//            }
//        }

        printPathBetweenSrcToDes(graph,visited,0,"0");

    }
}
