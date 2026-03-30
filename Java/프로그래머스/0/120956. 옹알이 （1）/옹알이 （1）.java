class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s: babbling) {
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            
            for (char c : s.toCharArray()) {
                sb.append(c);
                
                if (sb.toString().equals("aya") || sb.toString().equals("ye") ||
                     sb.toString().equals("woo") || sb.toString().equals("ma")) {
                    flag = true;
                    sb.setLength(0);
                } else {
                    flag = false;
                }
            }
            
            if (flag) {
                answer++;
            }
        }
        
        return answer;
    }
}