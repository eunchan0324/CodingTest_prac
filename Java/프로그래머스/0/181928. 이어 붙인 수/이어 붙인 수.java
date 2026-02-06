class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for (int num : num_list) {
            if (num % 2 != 0) {
                odd += String.valueOf(num);
            } else {
                even += "" + num;
            }
        }
        
        int oddNum = Integer.parseInt(odd);
        int evenNum = Integer.parseInt(even);
        
        return oddNum + evenNum;
    }
}