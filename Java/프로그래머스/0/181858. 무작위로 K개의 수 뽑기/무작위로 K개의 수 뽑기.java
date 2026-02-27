class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        boolean[] isVisited = new boolean[100001];
        
        int idx = 0;
        for (int n : arr) {
            if (idx == k) break;
            
            if (!isVisited[n]) {
                isVisited[n] = true;
                answer[idx++] = n;
            }
        }
        
        for (int i = idx; i < k; i++) {
            answer[i] = -1;
        }
        
        return answer;
    }
}