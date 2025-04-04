package trees;

public class InsertNodeInBinarySearchTree {

    private static void addNode(TreeNode root, TreeNode targetNode){
        
    }

    public static void main(String[] args) {
//        The left child contains only nodes with values less than the parent node.
//        The right child contains only nodes with values greater than the parent node.

        TreeNode treeNode= DefaultTreeCreator.getTree(new int[]{8,5,15,3,7,10,25});
        addNode(treeNode,new TreeNode(12));
        DefaultTreeCreator.printNode(treeNode);
    }
}
