package amazone;

import trees.DefaultTreeCreator;
import trees.TreeNode;

public class DeleteAlternateNodes {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        TreeNode head= DefaultTreeCreator.getLinkList(arr);
        TreeNode helper=head;
        int index=0;
        while (helper!=null){

            index++;
        }

        DefaultTreeCreator.printLinkList(head);
    }
}
