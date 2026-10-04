class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> khali = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                khali.push(i);
            } 
            else if (c == '*') {
                star.push(i);
            } 
            else {
                if (!khali.isEmpty()) {
                    khali.pop();
                } 
                else if (!star.isEmpty()) {
                    star.pop();
                } 
                else {
                    return false;
                }
            }
        }

        while (!khali.isEmpty()) {
            if (star.isEmpty()) {
                return false;
            }

            if (khali.pop() > star.pop()) {
                return false;
            }
        }

        return true;
    }
}