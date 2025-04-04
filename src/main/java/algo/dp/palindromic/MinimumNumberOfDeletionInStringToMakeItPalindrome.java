package algo.dp.palindromic;

public class MinimumNumberOfDeletionInStringToMakeItPalindrome {
    public static void main(String[] args) {
       String str="geeksforgeeks";
       StringBuilder stringBuilder=new StringBuilder(str);

        System.out.println(str.length()-solution(str,stringBuilder.reverse().toString(),str.length(),0,0));
    }

    private static int solution(String str, String str2, int m,int i,int j){
        // Base
        if(i==m || j==m)return 0;

        // Pre val

        // Main
        if(str.charAt(i)==str2.charAt(j)){
            return 1+solution(str,str2,m,i+1,j+1);
        }else{
            return Math.max(solution(str,str2,m,i,j+1),solution(str,str2,m,i+1,j));
        }
    }
}
