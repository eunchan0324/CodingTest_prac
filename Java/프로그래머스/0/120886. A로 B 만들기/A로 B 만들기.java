class Solution {
    public int solution(String before, String after) {
        int[] list1 = new int[26];
        int[] list2 = new int[26];
        
        for (char c : after.toCharArray()) {
            list1[c - 97]++;
        }
        
        for (char c : before.toCharArray()) {
            list2[c -97]++;
        }
        
        for (int i=0; i<list1.length; i++) {
            if (list1[i] != list2[i]) {
                return 0;
            }
        }
        
        return 1;
    }
}