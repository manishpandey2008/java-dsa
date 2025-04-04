package amazone;

import trees.DefaultTreeCreator;
import trees.TreeNode;

public class MaximumPathSumBetweenTwoLeaves {

    public static void main(String[] args) {
        /*
        Maximum Path Sum Between Two Leaves
        You are given a non-empty binary tree where each node has a non-negative integer value. Return the maximum possible sum of path between any two leaves of the given tree.
        The path is also inclusive of the leaf nodes and the maximum path sum may or may not go through the root of the given tree.
        If there is only one leaf node in the tree, then return -1.
         */
        int[] treeInput={10,20};
        TreeNode root= DefaultTreeCreator.getTree(treeInput);
        solution(root);
        System.out.println(max);
    }
    private static int max= Integer.MIN_VALUE;
    private static int solution(TreeNode treeNode){
        if(treeNode==null)return 0;
        int left = solution(treeNode.left);
        int right= solution(treeNode.right);

        if(treeNode.left!=null && treeNode.right!=null){
            max=Math.max(max,left+right+treeNode.val);
            return Math.max(left, right) + treeNode.val;
        }
        return( treeNode.left==null ? right:left)+treeNode.val;
    }
}
