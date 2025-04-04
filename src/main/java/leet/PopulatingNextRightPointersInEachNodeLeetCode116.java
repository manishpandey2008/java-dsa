package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersInEachNodeLeetCode116 {
    public static void main(String[] args) {

        TreeNode treeNode = DefaultTreeCreator.getTree(new int[]{3,9,20,2,3,15,7,9,6,7,8,5});
        List<List<TreeNode>> resp=new ArrayList<>();

        solution(treeNode,0,resp);


        resp.forEach(p->{
            p.forEach(System.out::print);
            System.out.println();
        });

    }

    private static void solution(TreeNode treeNode,int level,List<List<TreeNode>> resp){
        if(treeNode==null)return;

        if(level==resp.size()){
            resp.add(new ArrayList<>());
        }
        List<TreeNode> tempList=resp.get(level);
        treeNode.next=tempList.isEmpty()?null:tempList.get(tempList.size()-1);
        resp.get(level).add(treeNode);

        solution(treeNode.right,level+1,resp);
        solution(treeNode.left,level+1,resp);
    }


}
