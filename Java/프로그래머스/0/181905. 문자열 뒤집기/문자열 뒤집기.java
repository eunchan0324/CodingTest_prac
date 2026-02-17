class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        String rev = my_string.substring(s, e+1);
        
        for (int i=rev.length()-1; i>-1; i--) {
            sb.append(rev.charAt(i));
        }
        
        for (int i=e+1; i<my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}