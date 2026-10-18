class Solution {
    public String removeDuplicates(String s) {
        Deque <Character> ku = new ArrayDeque<>();
        
        for(int i = 0 ; i < s.length() ; i++){
              if (!ku.isEmpty() && ku.peek() == s.charAt(i)) {
                ku.pop();
            } else {
                ku.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!ku.isEmpty()){
            ans.append(ku.removeLast());
        }
        return ans.toString();
    }
}