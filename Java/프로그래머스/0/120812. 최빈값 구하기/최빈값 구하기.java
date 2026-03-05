class Solution {
    public int solution(int[] array) {
        int[] map = new int[1000];
        
        for (int n : array) {
            map[n]++;
        }
        
        int maxCount = 0;
        int mode = 0;
        
        for (int i=0; i<map.length; i++) {
            if (map[i] > maxCount) {
                maxCount = map[i];
                mode = i;
            }
            else if (map[i] == maxCount && maxCount != 0) {
                mode = -1;
            }
        }
        
        return mode;
    }
}