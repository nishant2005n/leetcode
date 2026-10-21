class RecentCounter {
    Deque<Integer> st = new ArrayDeque<>();

    public RecentCounter() {
    }
      public int ping(int t) {
        st.add(t);
        while(st.peek() < t-3000){
            st.remove();
        }
          return st.size();
    }
}
    
    

