package amazone;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        /*
            You have been given two strings ‘str1’ and ‘str2’ of length N and M respectively. Your task is to check whether string ‘str2’ contains one of the permutations of string ‘str1’ as its substring.
            In other words, find whether there exists any permutation of string ‘str1’ that is a substring of ‘str2’.
            A string ‘x’ is a permutation of another string ‘y’ only if sorted(x) = sorted(y). For example, LISTEN is a permutation of SILENT.
            Note: ‘str1’ and ‘str2’ contains only lowercase English Alphabet letters.
         */

       String str1 = "adc";
       String str2 = "dcda";

//        System.out.println(byRecursion(str2,str1,"",0));

        System.out.println(solution2(str2,str1));
    }

    public static boolean byRecursion(String str, String target,String current,int index){
        if(index==str.length() || current.length()> target.length())return false;
        if(current.length()== target.length()) return check(target,current);
        return byRecursion(str,target,current+str.charAt(index),index+1) || byRecursion(str,target,current,index+1);
    }

    private static boolean check(String str1, String str2){
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char a: str1.toCharArray())arr1[a-'a']++;
        for(char a: str2.toCharArray())arr2[a-'a']++;
        return Arrays.equals(arr1,arr2);
    }

    private static boolean solution2(String str, String target){
        if(str==target) return true;
        if(str.length()<target.length()) return false;

        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char a: target.toCharArray())arr1[a-'a']++;
        for(int i=0;i<target.length();i++) arr2[str.charAt(i)-'a']++;

        if(Arrays.equals(arr1,arr2))return true;
        int n=target.length();
        int index=target.length();
        for(int i=index;i<str.length();i++){
            arr2[str.charAt(i)-'a']++;
            arr2[str.charAt(i-n)-'a']--;
            if(Arrays.equals(arr1,arr2))return true;
        }

        return false;
    }



}
