package algo.dp.longestCommonSubsequence;

public class LongestCommonSubsequenceRecursive {
    public static void main(String[] args) {
        // We can solve this my Map
        String s1="ABC";
        String s2="CBA";
        System.out.println(solution(s1,s2,0,0));
    }

    public static int solution(String s1, String s2,int i,int j){
        if(i==s1.length() || j == s2.length())return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solution(s1,s2,i+1,j+1);
        }else{
            return Math.max(
                    solution(s1,s2,i+1,j),
                    solution(s1,s2,i,j+1)
            );
        }
    }

}
