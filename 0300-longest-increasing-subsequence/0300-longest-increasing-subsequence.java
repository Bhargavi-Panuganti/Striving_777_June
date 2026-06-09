class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1)
            return 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int max = 1;
        for (int x : dp)
            max = Math.max(max, x);
        return max;
    }
}