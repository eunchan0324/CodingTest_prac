class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = code.toCharArray();
        
        for (int i=0; i<arr.length; i++) {
            if (i % q == r) {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}