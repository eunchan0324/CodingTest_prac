class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for (int i=0; i<finished.length; i++) {
            if (!finished[i]) {
                size ++;
            }
        }
        
        String[] answer = new String[size];
        
        for (int i=0, idx=0; i<finished.length; i++) {
            if (!finished[i]) {
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}