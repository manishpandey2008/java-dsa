package leet;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromStringLeetcode2390 {
    public static void main(String[] args) {
        String str=new String("leet**cod*e");
        Stack<Character> stack=new Stack<>();
        for (char c: str.toCharArray()){
            if(c=='*' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        System.out.println(stack.toString());

    }
}
