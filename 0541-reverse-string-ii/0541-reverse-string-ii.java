class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;

        while(i < arr.length){
            int left = i;
            int right = i + k - 1;

            if(arr.length <= right){
                right = arr.length - 1 ;
            }

            while(left < right){
                char temp = arr [left];
                arr [left] = arr [right];
                arr [right] = temp;
                left ++;
                right --;
            }

            i = i + 2 * k;   
        } 

        return new String (arr);
    }
}