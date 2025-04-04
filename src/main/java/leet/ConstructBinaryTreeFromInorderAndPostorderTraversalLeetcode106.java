package leet;

import trees.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalLeetcode106 {

    private static int portOrderIndex=0;

    private static TreeNode solution(int[] inOrder,int[] postOrder,int start,int end){
        if(start>=end)return null;

        int item=postOrder[portOrderIndex--];
        TreeNode root=new TreeNode(item);

        int index=findIndex(inOrder,start,end,item);

        root.right=solution(inOrder,postOrder,index+1,end);
        root.left=solution(inOrder,postOrder,start,index-1);

        return root;
    }

    private static int findIndex(int[] inOrder,int start,int end,int target){
        for (int i=start;i<=end;i++){
            if(target==inOrder[i])return i;
        }
        throw new RuntimeException("Not Found");
    }

    public static void main(String[] args) {
        int[] inOrder={9,3,15,20,7};
        int[] postOrder={9,15,7,20,3};
        portOrderIndex=postOrder.length-1;
        TreeNode treeNode= solution(inOrder,postOrder,0,inOrder.length-1);
        System.out.println(treeNode.right.val);
    }
}
