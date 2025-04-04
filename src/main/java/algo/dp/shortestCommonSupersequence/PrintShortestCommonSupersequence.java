package algo.dp.shortestCommonSupersequence;

public class PrintShortestCommonSupersequence {
    public static void main(String[] args) {
        String s1="HELLO", s2="GEEK";

        System.out.println(solution(s1,s2,s1.length(),s2.length(),0,0));
    }

    private static String solution(String s1, String s2, int m, int n,int i,int j){
        if(i==m) return s2.substring(j);
        if(j==n) return s1.substring(i);

        if(s1.charAt(i)==s2.charAt(j)){
            return s1.charAt(i) + solution(s1,s2,m,n,i+1,j+1);
        }else{
            String a = solution(s1,s2,m,n,i+1,j);
            String b = solution(s1,s2,m,n,i,j+1);
            return (a.length()>b.length()) ? s2.charAt(j) + b : s1.charAt(i) + a;
        }

    }
}
