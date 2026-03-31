class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int coupon = chicken;
        while (coupon > 9) {
            int service = coupon / 10;
            int least = coupon % 10;
            
            // 치킨 주문
            answer += service;
            
            // 주문 후, 사용한 쿠폰 10으로 나눠주기.
            coupon /= 10;
            
            // 주문 후 남은 쿠폰 더하기
            coupon += least;
        }
        
        return answer;
    }
}