class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();        
        for (char c : my_string.toCharArray()) {
            if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
                if (sb.length() > 0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
                System.out.println(sb);
            }
        }
        
        if (sb.length() > 0) {
            answer += Integer.parseInt(sb.toString());
        }
        
        return answer;
    }
}