package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfBinaryTreeLeetcode958 {

    private static boolean solution(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean isStaredNll=false;
        while (!queue.isEmpty()){
            TreeNode cNode=queue.poll();
            if(cNode!=null && isStaredNll){
                return false;
            }
            if(cNode==null){
                isStaredNll=true;
            }else{
                queue.add(cNode.left);
                queue.add(cNode.right);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode root= DefaultTreeCreator.getTree(new int[]{1,2,3,4,5,6});
        root.left.left.left=(new TreeNode(20)); // FOR MAKE FALSE
        System.out.println(solution(root));
    }

}
