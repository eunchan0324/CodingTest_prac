class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int result = 0;
        int[] nums = new int[included.length];
        
        for (int i=0; i<included.length; i++) {
            if (i == 0) {
                nums[i] = a;
            } else {
                nums[i] = nums[i-1] + d;
            }
        }
        
        for (int i=0; i<included.length; i++) {
            if (included[i] == true) {
                result += nums[i];
            }
        }
        
        return result;
    }
}