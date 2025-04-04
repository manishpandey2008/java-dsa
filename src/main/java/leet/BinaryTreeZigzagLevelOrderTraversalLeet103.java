package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalLeet103 {
    public static void main(String[] args) {
        TreeNode treeNode = DefaultTreeCreator.getTree(new int[]{3,9,20,2,3,15,7,9,6,7,8,5});
        List<List<Integer>> resp=new ArrayList<>();

        solution(treeNode,0,resp);

        resp.forEach(p->{
            p.forEach(System.out::print);
            System.out.println();
        });
    }

    private static void solution(TreeNode treeNode,Integer level,List<List<Integer>> resp){
        if(treeNode==null)return;

        if(level==resp.size()){
            resp.add(new ArrayList<>());
        }
        if(level%2==0){
            resp.get(level).add(treeNode.val);
        }else{
            resp.get(level).add(0,treeNode.val);
        }

        solution(treeNode.left,level+1,resp);
        solution(treeNode.right,level+1,resp);
    }
}
