package trees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeInCompleteBinaryTree {

    private static void addNode(TreeNode root,TreeNode targetNode){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode currentNode=queue.poll();
            if(currentNode.left==null){
                currentNode.left=targetNode;
                break;
            }
            if(currentNode.right==null){
                currentNode.right=targetNode;
                break;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);
        }
    }

    public static void main(String[] args) {
        DefaultTreeCreator defaultTreeCreator= new DefaultTreeCreator();
        TreeNode treeNode= defaultTreeCreator.getTree(new int[]{1,2,3,4,5,6,7,8,9});
        addNode(treeNode,new TreeNode(10));
        defaultTreeCreator.printNode(treeNode);
    }
}
