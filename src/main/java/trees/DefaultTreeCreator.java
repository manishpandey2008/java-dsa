package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DefaultTreeCreator {
    public static TreeNode getTree(int[] arr){
        Queue<TreeNode> queue=new LinkedList<>();
        int count=1;
        TreeNode root=new TreeNode(arr[0]);
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode currentNode=queue.poll();
            if(count<arr.length){
                TreeNode tempNode=new TreeNode(arr[count]);
                currentNode.left=tempNode;
                queue.add(tempNode);
                count++;
            }
            if(count<arr.length){
                TreeNode tempNode=new TreeNode(arr[count]);
                currentNode.right=tempNode;
                queue.add(tempNode);
                count++;
            }
        }
        return root;
    }

    public static void printNode(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        queue.add(root);
        stack.push(root);
        while (!queue.isEmpty()){
            TreeNode currentNode=queue.poll();
            stack.pop();
            System.out.print(currentNode.val+" ");
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
            if(stack.isEmpty()){
                System.out.println();
                queue.forEach(stack::push);
            }
        }
    }


    public static String getInorder(TreeNode treeNode){
        if(treeNode==null || treeNode.val==-1 )return "";
       String leftStr= getInorder(treeNode.left);
       String rootStr=String.valueOf(treeNode.val);
       String rightStr=getInorder(treeNode.right);
        return leftStr+rootStr+rightStr;
    }

    public static TreeNode getLinkList(int[] arr){
        TreeNode root=new TreeNode(arr[0]);
        TreeNode nextNode=root;
        for(int i=1;i<arr.length;i++){
            nextNode.right=new TreeNode(arr[i]);
            nextNode=nextNode.right;
        }
        return root;
    }

    public static void printLinkList(TreeNode treeNode){
        TreeNode helper=treeNode;
        while (helper!=null){
            System.out.print(helper.val+"--->");
            helper=helper.right;
        }
    }





}
