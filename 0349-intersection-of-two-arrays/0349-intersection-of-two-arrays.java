class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> temp = new HashSet<>();
        for(int x : nums1){
            temp.add(x);
        }

        HashSet <Integer> result = new HashSet<>();
        for(int x : nums2) {
            if(temp.contains(x)){
                result.add(x);
                temp.remove(x);
            }
        }  
        
        int[] b = new int[result.size()];
        int i = 0;
        for(int x : result){
        b[i] = x;
        i++;
        }
        return b;
    }
}
