class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] s1 = new char[str1.length()];
        char[] s2 = new char[str2.length()];
        
        
        for(int i=0; i<str1.length(); i++) {
            s1[i] = str1.charAt(i);
        }
        
        for(int i=0; i<str2.length(); i++) {
            s2[i] = str2.charAt(i);
        }
        
        for(int i=0; i<s1.length; i++) {
            answer += s1[i];
            answer += s2[i];
        }
        
        return answer;
    }
}