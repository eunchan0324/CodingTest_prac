class Solution {
    public int solution(String my_string) {
        String onlyNums = my_string.replaceAll("[^0-9]", "");
        
        int answer = 0;
        
        for (char c : onlyNums.toCharArray()) {
            answer += c - '0';
        }
        
        return answer;
    }
}