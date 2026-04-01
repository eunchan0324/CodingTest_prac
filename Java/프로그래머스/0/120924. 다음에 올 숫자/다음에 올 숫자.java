class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int what = 0;
        
        if (common[2]-common[1] == common[1]-common[0]) {
            what = 1;
        } else {
            what = 2;
        }
        
        if (what == 1) {
            answer = common[common.length-1] + (common[1]-common[0]);
        } else {
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        
        return answer;
    }
}