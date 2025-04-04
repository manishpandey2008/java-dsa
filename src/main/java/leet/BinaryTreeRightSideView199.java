package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView199 {
    public static void main(String[] args) {
        TreeNode treeNode= DefaultTreeCreator.getTree(new int[]{1,2,3,-1,5,-1,4});

        List<Integer> res=new ArrayList<>();
        solution(treeNode,0,res);
        res.forEach(System.out::println);
    }

    private static void solution(TreeNode treeNode,int level,List<Integer> res){
        if(treeNode==null)return;

        if(res.size()==level){
            res.add(treeNode.val);
        }

        solution(treeNode.right,level+1,res);
        solution(treeNode.left,level+1,res);

    }
}
