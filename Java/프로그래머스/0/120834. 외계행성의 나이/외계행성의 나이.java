class Solution {
    public String solution(int age) {
        String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        
        String ageStr = String.valueOf(age);
        
        for (char c : ageStr.toCharArray()) {
            sb.append(strArr[Integer.parseInt(String.valueOf(c))]);
        }
        
        return sb.toString();
    }
}