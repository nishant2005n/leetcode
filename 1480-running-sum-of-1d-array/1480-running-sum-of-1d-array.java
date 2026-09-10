class Solution {
    public int[] runningSum(int[] nums) {
        int[] store = new int[nums.length];
        store[0] = nums[0];
        for ( int i = 1; i < nums.length ; i++){
            store[i] = store[i-1] + nums[i];

        }
        return store;
    }
}