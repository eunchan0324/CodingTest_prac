import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        // 가로
        List<String> width = new ArrayList<>();
        for (int i=0; i<picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<picture[i].length(); j++) {
                for (int l=0; l<k; l++) {
                    sb.append(String.valueOf(picture[i].charAt(j)));
                }
            }
            width.add(sb.toString());
        }
        
        // 세로
        List<String> height = new ArrayList<>();
        for (int i=0; i<width.size(); i++) {
            for (int j=0; j<k; j++) {
                height.add(width.get(i));
            }
        }
        
        String[] answer = new String[picture.length *k];
        for (int i=0; i<height.size(); i++) {
            answer[i] = height.get(i);
        }
        
        return answer;
    }
}