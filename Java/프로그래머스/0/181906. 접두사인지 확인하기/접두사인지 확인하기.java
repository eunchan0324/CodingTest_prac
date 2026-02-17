class Solution {
    public int solution(String my_string, String is_prefix) {
        int strLen = my_string.length();
        int preLen = is_prefix.length();
        
        if (strLen < preLen) {
            return 0;
        } else if (strLen == preLen) {
            return my_string.equals(is_prefix) ? 1 : 0;
        } else {
            return my_string.substring(0, preLen).equals(is_prefix) ? 1 : 0;
        }
        
    }
}