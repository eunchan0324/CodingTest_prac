class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // ms 문자열을 char 배열에 넣고
        char[] ms = new char[my_string.length()];
        
        for (int i=0; i<my_string.length(); i++) {
            ms[i] = my_string.charAt(i);
        }
        
        // os 문자열을 char 배열에 넣기
        char[] os = new char[overwrite_string.length()];
        
        for (int i=0; i<overwrite_string.length(); i++) {
            os[i] = overwrite_string.charAt(i);
        }
        
        // os 문자열 만큼 
        for (int i=0; i<os.length; i++) {
            // ms를 갈아낌
            ms[i+s] = os[i];
        }
        
        // ms를 answer에 넣어줌 
        for (int i=0; i<ms.length; i++) {
            answer += ms[i];
        }
    
        return answer;
    }
}