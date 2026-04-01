class Solution {
    public int solution(String A, String B) {
        
        for (int i=0; i<A.length(); i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j=A.length()-i; j<A.length(); j++) {
                sb.append(A.charAt(j));
            }

            for (int j=0; j<A.length()-i; j++) {
                sb.append(A.charAt(j));
            }
            
            if (sb.toString().equals(B)) {
                return i;
            }
        }
            
        return -1;
    }
}