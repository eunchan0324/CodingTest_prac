import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] arr1 = new int[arr.length];
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr1[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr1[i] = arr[i] * 2 + 1;
            } else {
                arr1[i] = arr[i];
            }
        }
        
        while (!Arrays.equals(arr, arr1)) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            } 
            
            for (int i=0; i<arr1.length; i++) {
                if (arr1[i] >= 50 && arr1[i] % 2 == 0) {
                    arr1[i] /= 2;
                } else if (arr1[i] < 50 && arr1[i] % 2 != 0) {
                    arr1[i] = arr1[i] * 2 + 1;
                }
            }
            
            answer += 1;
        }
        
        
        return answer;
    }
}