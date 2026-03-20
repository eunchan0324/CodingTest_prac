class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int answer = Integer.parseInt(arr[0]);
        
        boolean operator = true;
        
        for (int i=1; i<arr.length; i++) {
            if (arr[i].equals("-")) {
                operator = false;
            } else if (arr[i].equals("+")) {
                operator = true;
            } else {
                if (operator) {
                    answer += Integer.parseInt(arr[i]);
                } else {
                    answer -= Integer.parseInt(arr[i]);
                }
            }
        }
        
        return answer;
    }
}