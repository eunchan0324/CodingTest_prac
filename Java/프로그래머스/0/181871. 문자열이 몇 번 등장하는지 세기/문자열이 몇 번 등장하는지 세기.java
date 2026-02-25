class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int n = pat.length();
        
        for (int i=0; i<=myString.length() - n; i++) {
            if (myString.startsWith(pat, i)) answer ++;
        }
        
        return answer;
    }
}