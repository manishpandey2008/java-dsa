package leet;

import graph.BreathFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MinimumScoreOfPathBetweenTwoCitiesLeetcode2492 {
    public  static class Edge{
        public int u;
        public int v;
        public int w;

        public Edge(int u, int v,int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
    }

    private static void createGraph(List<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(1,2,9));
        graph[0].add(new Edge(1,4,7));

        graph[1].add(new Edge(2,1,9));
        graph[1].add(new Edge(2,4,5));
        graph[1].add(new Edge(2,3,6));

        graph[2].add(new Edge(3,2,6));

        graph[3].add(new Edge(4,1,7));
        graph[3].add(new Edge(4,2,5));

    }

    private static int minVal=Integer.MIN_VALUE;

    private static void getMin(List<Edge>[] graph,int index,int end,int weight, boolean[] visited){
        if(index==end){
            minVal= Math.min(minVal,weight);
            return;
        }
        System.out.println(index);
        for(Edge edge: graph[index]) {
            if(!visited[edge.v-1]){
                visited[index]=true;
                getMin(graph,edge.v,end,weight+edge.w,visited);
                visited[index]=false;
            }
        }
    }

    public static void main(String[] args) {
        List<Edge>[] graph =new ArrayList[4];
        createGraph(graph);
        boolean[] visit=new boolean[4];

        getMin(graph,0,3,0,visit);
//        for(int i=0;i<graph.length;i++){
//            System.out.println(i +" : "+ graph[i]);
//        }
        System.out.println(minVal);

    }
}
