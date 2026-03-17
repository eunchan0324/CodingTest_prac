class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int len = numbers.length;
        
        if (len < 3) {
            max = numbers[0] * numbers[1]; 
        } else {
            for (int i=0; i<len; i++) {
                for (int j=0; j<len; j++) {
                    if (i != j) {
                        int cnt = numbers[i] * numbers[j];
                        if (max < cnt) {
                            max = cnt;
                        }
                    }
                }
            }
        }
        
        return max;
    }
}