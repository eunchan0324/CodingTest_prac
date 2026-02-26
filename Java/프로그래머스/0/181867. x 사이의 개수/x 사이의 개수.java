class Solution {
    public int[] solution(String myString) {
        String[] myStr = myString.split("x");
        
        int size = 0;
        if (myString.charAt(myString.length()-1) == 'x') {
            size = myStr.length + 1;
        } else {
            size = myStr.length;
        }
        
        int[] answer = new int[size];
        
        for (int i=0; i<myStr.length; i++) {
            answer[i] = myStr[i].length();
        }
        
        return answer;
    }
}