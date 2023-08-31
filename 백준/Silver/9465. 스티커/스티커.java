import java.io.*;
import java.util.*;

public class Main {
	static int[][] dp;

	
	static int sum(int[][] a, int idx, int prev) {
		if (idx >= a[0].length)
			return 0; 
		if (dp[idx][prev] != -1)
			return dp[idx][prev];
		int max = 0;
		for (int i = 0; i <= 2; i++) {
			if (i == 0 || i != prev) {
				int ans = a[i][idx] + sum(a, idx + 1, i);
				if (ans > max)
					max = ans;
			}
		}
		return dp[idx][prev] = max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] a = new int[3][n];

			StringTokenizer st;
			for (int j = 1; j <= 2; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < a[j].length; k++) {
					a[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			dp = new int[n][3];
			for (int j = 0; j < dp.length; j++) {
				for (int k = 0; k < dp[j].length; k++) {
					dp[j][k] = -1;
				}
			}
			System.out.println(sum(a, 0, 0));
		}
	}
}