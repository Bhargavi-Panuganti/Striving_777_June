class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        // Sort by age first — if same age, sort by score:
        int n = scores.length;
        int[][] players = new int[n][2];
        for (int i = 0; i < n; i++) {
            players[i][0] = ages[i];
            players[i][1] = scores[i];
        }
        Arrays.sort(players, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        if (scores.length == 1)
            return scores[0];

        int[] dp = new int[scores.length];
        for (int i = 0; i < n; i++)
            dp[i] = players[i][1];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < i; j++) {
                if (players[j][1] <= players[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + players[i][1]);
                }
            }
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}