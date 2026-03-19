class Solution {
    public long solution(String numbers) {
        
        String result = "";
        String cnt = new String();
        
        for (int i=0; i<numbers.length(); i++) {
            cnt += numbers.charAt(i) + "";
            
            if (cnt.equals("one")) {
                result += "1";
                cnt = "";
            } else if (cnt.equals("two")) {
                result += "2";
                cnt = "";
            } else if (cnt.equals("three")) {
                result += "3";
                cnt = "";
            } else if (cnt.equals("four")) {
                result += "4";
                cnt = "";
            } else if (cnt.equals("five")) {
                result += "5";
                cnt = "";
            } else if (cnt.equals("six")) {
                result += "6";
                cnt = "";
            } else if (cnt.equals("seven")) {
                result += "7";
                cnt = "";
            } else if (cnt.equals("eight")) {
                result += "8";
                cnt = "";
            } else if (cnt.equals("nine")) {
                result += "9";
                cnt = "";
            } else if (cnt.equals("zero")) {
                result += "0";
                cnt = "";
            }
        }
                       
        long answer = Long.parseLong(result);
        
        return answer;
    }
}