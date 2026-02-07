class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for (int i=0; i<num_list.length; i++) {
            int num = num_list[i];
            answer[i] = num;
            
            if (i == num_list.length -1) {
                if (num_list[i] > num_list[i-1]) {
                    answer[i+1] = num - (num_list[i-1]);
                } else {
                    answer[i+1] = num*2;
                }
            }
        }
        
        return answer;
    }
}