class Solution {
    public boolean isValid(String s) {
        Stack <Character> khali = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                khali.push(c);
            }else{
                if(khali.isEmpty()){
                return false;
            }
            if (( c == ')' && khali.peek() == '(') ||
                (c == '}' && khali.peek() == '{') ||
                (c == ']' && khali.peek() == '[')){
                khali.pop();
                
            }else{
                return false;
            }
            }
        }
        return khali.isEmpty();
    }
}