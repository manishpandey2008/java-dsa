package trees;

public class TreeByPostAndInOrders {
    static private int postorderIndex ;

    private static TreeNode buildSubTree(int[] inorder, int[] postorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) {
            return null;
        }
        int rootValue = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = findIndex(inorder, inorderStart, inorderEnd, rootValue);

        root.right = buildSubTree(inorder, postorder, rootIndex + 1, inorderEnd);
        root.left = buildSubTree(inorder, postorder, inorderStart, rootIndex - 1);

        return root;
    }

    private static int findIndex(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        throw new IllegalArgumentException("Value not found in Inorder array");
    }

    public static void main(String[] args) {

        int[] inorder = {9, 3, 9, 15, 20, 7};
        int[] postorder = {9, 9, 15, 7, 20, 3};

        postorderIndex = postorder.length - 1;
        TreeNode treeNode= buildSubTree(inorder, postorder, 0, inorder.length - 1);
        System.out.println(treeNode.left.val);

    }
}
