class Solution {
    public String solution(String myString, String pat) {
        int m = myString.length();
        int n = pat.length();
        
        for (int i= m-n; i>=0; i--) {
            boolean ok = true;
            for (int j=0; j<n; j++) {
                if (myString.charAt(i+j) != pat.charAt(j)) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return myString.substring(0, i+n);
            }
        }        
        return "";
    }
}