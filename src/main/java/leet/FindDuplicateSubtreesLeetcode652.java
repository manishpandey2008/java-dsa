package leet;

import trees.DefaultTreeCreator;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtreesLeetcode652 {
    public static void main(String[] args) {
        TreeNode root= DefaultTreeCreator.getTree(new int[]{1,2,2,4,5,4,5});
        List<TreeNode> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        solution(root,map,res);
        System.out.println(res);
    }

    public static String solution(TreeNode root,Map<String,Integer> map, List<TreeNode> res){
        if(root==null)return "";

        String left=solution(root.left,map,res);
        String right = solution(root.right,map,res);
        String current=String.valueOf(root.val);
        String string=String.join(",",current,left,right);
        if(map.getOrDefault(string,0)==1){
            res.add(root);
        }
        map.put(string,map.getOrDefault(string,0)+1);
        return string;
    }


}
