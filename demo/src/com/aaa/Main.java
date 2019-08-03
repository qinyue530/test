package com.aaa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		int n = sc.nextInt();
		int w[] = new int[n];
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		int W = sc.nextInt();
		int res = solution(w, v, n, W);
		System.out.println(res);
	}

	private static int solution(int[] w, int[] v, int n, int W) {
		int dp[][] = new int[n][W + 1];
		for (int i = 0; i <= W; i++) {
			dp[0][i] = i / w[0] * v[0];
		}
		for (int i = 0; i < n; i++) {
			dp[i][0] = 0;
		}
		int max = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= W; j++) {
				for (int k = 0; k * w[i] <= j; k++) {
					int t = k * v[i] + dp[i - 1][j - k * w[i]];
					if (max < t) {
						max = t;
					}
				}
				dp[i][j] = max;

				max = 0;
			}
		}
		return dp[n - 1][W];
	}
}
