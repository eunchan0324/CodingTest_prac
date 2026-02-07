class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        
        for (int i=0; i<len; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minVal = Integer.MAX_VALUE;
            
            for (int j=s; j<=e; j++) {
                if (k < arr[j] && arr[j] < minVal) {
                    minVal = arr[j];
                }
            }
            
            if (minVal == Integer.MAX_VALUE) {
                answer[i] = -1;
            } else {
                answer[i] = minVal;
            }
        }
        
        return answer;
    }
}