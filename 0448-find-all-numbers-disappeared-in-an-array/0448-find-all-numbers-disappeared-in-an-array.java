class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> j= new HashSet <>();
        List <Integer> ans = new ArrayList<> ();
        for(int num : nums ){
            j.add(num);
        }
        for (int i = 1 ; i <= nums.length ; i++ ){
            if(!j . contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}