import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        return myString.toUpperCase(Locale.ROOT).indexOf(pat.toUpperCase(Locale.ROOT)) >= 0 ? 1 : 0;
    }
}