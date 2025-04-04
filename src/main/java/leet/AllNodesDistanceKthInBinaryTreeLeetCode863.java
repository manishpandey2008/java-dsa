package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.*;

public class AllNodesDistanceKthInBinaryTreeLeetCode863 {
    public static void main(String[] args) {
        TreeNode root= DefaultTreeCreator.getTree(new int[]{1,2,3,4,5,6,7,8,9});
        Map<Integer,TreeNode> childParentMap=new HashMap<>();
        Integer targetVal= 2;
        getChildParentMap(root,null,childParentMap);
        TreeNode targetNode= root.left;
        // Todo Apply BFS
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(targetNode);
        Map<Integer,Boolean> visit=new HashMap<>();
        visit.put(targetNode.val,true);
        while (!queue.isEmpty() && targetVal>=1){
            int queSize=queue.size();
            for(int i=0;i<queSize;i++){
                TreeNode tempNode=queue.poll();
                if(tempNode.left!=null && !visit.containsKey(tempNode.left.val))queue.add(tempNode.left);
                if(tempNode.right!=null && !visit.containsKey(tempNode.right.val))queue.add(tempNode.right);
                if(childParentMap.get(tempNode.val)!=null && !visit.containsKey(childParentMap.get(tempNode.val).val))queue.add(childParentMap.get(tempNode.val));
                visit.put(tempNode.val,true);
            }
            targetVal--;
        }

        List<Integer> res=new ArrayList<>();
        while(!queue.isEmpty()){
            res.add(queue.poll().val);
        }

        System.out.println(res);
    }

    public static void getChildParentMap(TreeNode treeNode,TreeNode prentNode,Map<Integer,TreeNode> childParentMap){
        if(treeNode==null)return;
        childParentMap.put(treeNode.val,prentNode);
        getChildParentMap(treeNode.left,treeNode,childParentMap);
        getChildParentMap(treeNode.right,treeNode,childParentMap);
    }
}
