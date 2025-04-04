package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class CourseScheduleLeet207 {
    public static void main(String[] args) {
        int numCourses = 3;
        int[][]prerequisites = {
                {0,1},{1,2},
        };
        

        Map<Integer,Integer> map=new HashMap<>();
        boolean[] visited=new boolean[numCourses];
        Arrays.stream(prerequisites).forEach(e->map.put(e[0],e[1]));
        Integer currentNode=prerequisites[0][0];
        while (currentNode>=0){
            if(visited[currentNode]){
                System.out.println(false);
                break;
            }
            visited[currentNode]=true;
            currentNode= map.getOrDefault(currentNode, -1);
        }
        System.out.println(true);
    }
}
