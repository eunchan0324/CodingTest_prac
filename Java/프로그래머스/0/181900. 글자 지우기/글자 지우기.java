class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] del = new boolean[my_string.length()];
        for (int idx : indices) del[idx] = true;
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<del.length; i++) {
            if (!del[i]) sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}