class Solution {
    int[] memo; 

    public int climbStairs(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return solve(n);
    }

    private int solve(int n) {
        if (n <= 2) return n;
        if (memo[n] != -1) return memo[n]; 
        memo[n] = solve(n-1) + solve(n-2);
        return memo[n];
    }
}