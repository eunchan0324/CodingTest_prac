class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            
            while (s < e) {
                char tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++;
                e--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : arr) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}