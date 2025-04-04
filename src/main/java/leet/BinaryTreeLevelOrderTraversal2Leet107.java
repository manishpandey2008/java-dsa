package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2Leet107 {
    public static void main(String[] args) {
        TreeNode treeNode = DefaultTreeCreator.getTree(new int[]{3,9,20,-1,-1,15,7});
        List<List<Integer>> resp=new ArrayList<>();
        solution(treeNode,0,resp);
        resp.forEach(p->{
            p.forEach(System.out::print);
            System.out.println();
        });
    }

    private static void solution(TreeNode treeNode,int level, List<List<Integer>> resp){
        if(treeNode==null)return;

        if(resp.size()==level){
            resp.add(0,new ArrayList<>());
        }

        resp.get(resp.size()-1-level).add(treeNode.val);
        solution(treeNode.left,level+1,resp);
        solution(treeNode.right,level+1,resp);

    }


}
