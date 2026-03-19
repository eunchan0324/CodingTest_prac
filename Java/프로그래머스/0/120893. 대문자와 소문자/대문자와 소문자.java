class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(String.valueOf(c).toLowerCase());
            } else {
                sb.append(String.valueOf(c).toUpperCase());
            }
        }
        
        return sb.toString();
    }
}