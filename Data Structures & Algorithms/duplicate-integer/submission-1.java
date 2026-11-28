class Solution {
    public boolean hasDuplicate(int[] nums) {
                Set<Integer> seen = new HashSet<>(nums.length * 2);

        for (int num: nums) {
            if (!seen.add(num)) {
                return true;
            }
            
        }
        return false;
    }
}