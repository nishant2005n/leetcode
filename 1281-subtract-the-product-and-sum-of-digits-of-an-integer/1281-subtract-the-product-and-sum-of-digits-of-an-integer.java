class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int product = 1;
        int sum = 0;
        int result = 0;

        while(num > 0){
            int ld = num % 10;
            product*= ld;
            sum+= ld;
            num/=10;
        }

        return result = product - sum;
    }
}