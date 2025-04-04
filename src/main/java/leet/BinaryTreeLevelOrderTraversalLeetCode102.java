package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversalLeetCode102 {
    public static void main(String[] args) {
        TreeNode treeNode = DefaultTreeCreator.getTree(new int[]{3,9,20,-1,-1,15,7});

//        Queue<TreeNode> queue=new LinkedList<>();
//        Stack<TreeNode> stack=new Stack<>();
//        stack.add(treeNode);
//        queue.add(treeNode);
        List<List<Integer>> res=new ArrayList<>();
//        List<Integer> childList=new ArrayList<>();
//        while (!queue.isEmpty()){
//            TreeNode cn=queue.poll();
//            stack.pop();
//            childList.add(cn.val);
//            if(cn.left!=null && cn.left.val!=-1){
//                queue.add(cn.left);
//            }
//            if(cn.right!=null && cn.right.val!=-1){
//                queue.add(cn.right);
//            }
//
//            if(stack.isEmpty()){
//                res.add(childList);
//                childList=new ArrayList<>();
//                queue.forEach(stack::push);
//            }
//        }

        solution(treeNode,0,res);

        res.forEach(p->{
            p.forEach(System.out::print);
            System.out.println();
        });

    }

    private static void solution(TreeNode treeNode, int level,List<List<Integer>> res){
        if(treeNode==null)return;

        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        List<Integer> tempArr=res.get(level);
        tempArr.add(treeNode.val);
        solution(treeNode.left,level+1,res);
        solution(treeNode.right,level+1,res);


    }
}
