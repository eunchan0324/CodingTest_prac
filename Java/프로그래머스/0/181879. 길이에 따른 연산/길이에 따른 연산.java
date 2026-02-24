class Solution {
    public int solution(int[] num_list) {
        
        if (num_list.length >= 11) {
            int sum = 0;
            for (int x : num_list) sum += x;
            return sum;
        } else {
            int prod = 1;
            for (int x : num_list) prod *= x;
            return prod;
        }
    }
}