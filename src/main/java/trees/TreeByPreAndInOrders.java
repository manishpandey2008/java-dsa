package trees;

public class TreeByPreAndInOrders {

    private static int preorderIndex = 0;

    public static TreeNode buildTree(int[] preorder,int[] inorder,int start,int end){
        if(start>end)return null;
        int preItem=preorder[preorderIndex++];
        TreeNode root=new TreeNode(preItem);

        int index=findIndex(inorder,start,end,preItem);

        root.left=buildTree(preorder,inorder,start,index-1);
        root.right=buildTree(preorder,inorder,index+1,end);
        return root;

    }

    static int findIndex(int[] inorder,int start, int end,int value){
        for(int i=start;i<=end;i++){
            if(inorder[i]==value)return i;
        }
        throw new IllegalArgumentException("Value not found in Inorder array");
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 9, 20, 15, 7};
        int[] inorder =  {9, 9, 3, 15, 20, 7};
        TreeNode treeNode= buildTree(preorder,inorder,0,inorder.length-1);

        System.out.println(treeNode.left.val);
    }
}
