class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] line = quiz[i].split(" ");
            
            Integer x = Integer.parseInt(line[0]);
            String operator = line[1];
            Integer y = Integer.parseInt(line[2]);
            Integer z = Integer.parseInt(line[4]);
            
            if (operator.equals("+")) {
                if (x + y == z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (x - y == z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        
        
        return answer;
    }
}