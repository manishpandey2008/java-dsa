package leet;

import java.util.*;

public class CloneGraph113 {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public static void main(String[] args) {
        Queue<Node> queue=new LinkedList<>();
        Map<Integer,Node> map=new HashMap();

//        Node result=new Node(node.val);
//        map.put(node.val,result);
//        queue.add(node);
//
//        while(!queue.isEmpty()){
//            Node currentNode=queue.poll();
//            Node currentNewNode= map.get(currentNode.val);
//            for(Node n:currentNode.neighbors){
//                if(!map.containsKey(n.val)){
//                    queue.add(n);
//                }
//                if(map.containsKey(n.val)){
//                    currentNewNode.neighbors.add(map.get(n.val));
//                }else{
//                    currentNewNode.neighbors.add(new Node(n.val));
//                }
//            }
//        }
    }
}
