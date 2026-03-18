class Solution {
    public int solution(int[] sides) {
        
        int max = Math.max(sides[0], sides[1] > sides[2] ? sides[1] : sides[2]);
        
        int sum = sides[0] + sides[1] + sides[2];
        
        int orders = sum - max;
        
        return max < orders ? 1 : 2;
    }
}