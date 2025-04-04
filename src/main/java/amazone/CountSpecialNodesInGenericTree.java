package amazone;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountSpecialNodesInGenericTree {
    public static void main(String[] args) {
        /*
            Q5. Count Special Nodes in Generic Tree
            Given a generic tree, find the count of all special nodes.
            A node is a special node if there is a path from root to that node with all distinct elements.
            The input was not a pointer to a tree. He’d give me an adjacency list and an array of values where the value of ith node in the adjacency list is the ith element in the values array.
            He asked me not a create a tree out of the given information and rather do it with the adjacency list itself.
         */

        int[] nodeElements={1,2,3,2,5,6,1};
        TreeNode root= DefaultTreeCreator.getTree(nodeElements);
        Set<Integer> set=new HashSet<>();
        solution(root,0,"");
        System.out.println(count);
    }

    static int count=0;

    private static void solution(TreeNode treeNode,int h, String str){
        if(treeNode.left==null && treeNode.right==null){
            str+=treeNode.val;
            h++;
            if(Arrays.stream(str.split(",")).collect(Collectors.toSet()).size()==h){
                count++;
            }
        }

        if(treeNode.left!=null){
            solution(treeNode.left,h+1,str+treeNode.val+",");
        }

        if(treeNode.right!=null){
            solution(treeNode.right,h+1,str+treeNode.val+",");
        }

    }

}
