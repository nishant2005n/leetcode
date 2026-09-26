class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int k = 0; k < words.length; k++) {

            char[] arr = words[k].toCharArray();

            int i = 0;
            int j = arr.length - 1;

            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
             words[k] = new String(arr);
        }

        return String.join(" ", words);
       
    }
}