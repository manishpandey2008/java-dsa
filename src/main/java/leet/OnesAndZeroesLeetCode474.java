package leet;

public class OnesAndZeroesLeetCode474 {
    public static void main(String[] args) {
        String[] strs={
                "10","0001","111001","1","0"
        };
        int m = 5, n = 3;

        int[][] dp = new int[m + 1][n + 1];
        for(String str : strs){
            int one = 0;
            int zero = 0;
            for(char c : str.toCharArray()){
                if(c == '1')
                    one++;
                else
                    zero++;
            }
            for(int i = m; i >= zero; i--){
                for(int j = n; j >= one; j--){
                    if(one <= j && zero <= i)
                        dp[i][j] = Math.max(dp[i][j],dp[i - zero][j - one] + 1);
                }
            }
        }

        System.out.println(dp[m][n]);

    }
}
