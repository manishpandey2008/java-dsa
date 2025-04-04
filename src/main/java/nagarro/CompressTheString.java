package nagarro;

import java.util.Stack;

public class CompressTheString {
    /*
        Ninja has been given a program to do basic string compression. For a character that is consecutively repeated more than once, he needs to replace the consecutive duplicate occurrences with the count of repetitions.
        Example:
        If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5". The string is compressed only when the repeated character count is more than 1.
    */

    public static void main(String[] args) {
        String str="aaaBBBBBcertMMMMA";
        StringBuilder stringBuilder=new StringBuilder();
        int i=0,j=0;
        int count=0;
        while (j < str.length()){
            if(str.charAt(i)==str.charAt(j)){
                j++;
                count++;
            }else{
                stringBuilder.append(str.charAt(i));
                if(count>1) stringBuilder.append(count);
                count=0;
                i=j;
            }
        }
        if(i!=j){
            stringBuilder.append(str.charAt(i));
            if(count>1) stringBuilder.append(count);
        }
        System.out.println(stringBuilder);
    }
}
