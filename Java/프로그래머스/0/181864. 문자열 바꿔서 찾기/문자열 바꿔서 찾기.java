class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<pat.length(); i++) sb.append(pat.charAt(i) == 'A' ? 'B' : 'A');
        
        String rPat = sb.toString();
        int len = rPat.length();

        boolean have = false;
        
        for (int i=0; i<myString.length()-len+1; i++) {
            if (myString.substring(i, i+len).equals(rPat)) {
                have = true;
                break;
            }
        }
        
        return have ? 1 : 0;
    }
}