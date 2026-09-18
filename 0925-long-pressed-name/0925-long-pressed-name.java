class Solution {
    public boolean isLongPressedName(String name, String typed) {
       int i = 0;
        int j = 0;

        for (j = 0; j < typed.length(); j++) {

            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            }
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
                j--;   // same position maintain
            }
            else {
                return false;
            }
        }

        return i == name.length();
    }
}