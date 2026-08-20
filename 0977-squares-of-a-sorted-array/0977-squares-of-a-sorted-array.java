class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int position=newArr.length-1;
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]) {
                newArr[position] = nums[i] * nums[i];
                i++;
            }else{
                newArr [position] = nums[j] * nums[j];
                j--;

            }
            position --;
        }
        return newArr;

    }
}

      