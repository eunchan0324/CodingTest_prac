class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int[] num : queries) {
            int s = num[0];
            int e = num[1];
            int k = num[2];
            
            for (int i=s; i<=e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        
        return arr;
    }
}