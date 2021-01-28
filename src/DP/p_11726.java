package DP;

import java.util.Scanner;

//2xn 직사각형 채우기
public class p_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int dp[] = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }

        System.out.println(dp[n]);
    }
}
