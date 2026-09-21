class Solution {
    public long[] resultArray(int[] nums, int k) {

        long[] ans = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {

            long[] next = new long[k];

            int rem = num % k;

            // Current element se new subarray
            next[rem] = 1;

            // Previous subarrays ko extend karo
            for (int i = 0; i < k; i++) {
                int newRem = (i * rem) % k;
                next[newRem] += dp[i];
            }

            // Answer me add karo
            for (int i = 0; i < k; i++) {
                ans[i] += next[i];
            }

            dp = next;
        }

        return ans;
    }
}
        
    
