class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        char c = (char) (k+'0');
        
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c) {
                return i+1;
            }
        }
        
        return -1;
    }
}