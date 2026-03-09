class Solution {
    public int solution(int n) {
        int pizza = 1;
        
        while (true) {
            if ((pizza*6) % n == 0) {
                break;
            } else {
                pizza++;
            }
        }
        
        return pizza;
    }
}