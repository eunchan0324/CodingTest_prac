class Solution {
    public String solution(String polynomial) {
        
        polynomial = polynomial.replace("+ ", "");
        String[] arr = polynomial.split(" ");
        
        int xCount = 0;
        int num = 0;
        for (String s : arr) {
            if (s.indexOf("x") == -1) {
                num += Integer.parseInt(s);
            } else if (s.indexOf("x") == 0) {
                xCount++;
            } else {
                xCount += Integer.parseInt(s.substring(0, s.indexOf("x")));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (xCount == 1) {
            sb.append("x");
        } else if (xCount > 0) {
            sb.append(xCount);
            sb.append("x");
        }
        
        if (num > 0) {
            if (xCount > 0) {
                sb.append(" + ");
            }
            sb.append(num);        
        }
        
        return sb.toString();
    }
}