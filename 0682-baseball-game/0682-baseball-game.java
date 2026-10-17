class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> hi = new ArrayDeque<>();
            for(int i = 0; i < operations.length; i++){
                 String x = operations[i];

                if(x.equals("C")){
                    hi.pop();
                }
                    
                    else if(x.equals("D")){
                        hi.push(hi.peek() * 2);
                    }
                    else if(x.equals ("+")){
                        int a = hi.pop();
                        int b = hi.peek();
                        hi.push(a);
                        hi.push(a + b);

                    }
                    else{
                        hi.push(Integer.parseInt(x));
                    }
                }
            int sum = 0 ;
            while(!hi.isEmpty()){
                sum += hi.pop();
            }
            return sum;
    }
}
            