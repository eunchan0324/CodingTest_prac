import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (int i=0; i<str.length(); i++) {
            char cType = str.charAt(i);
            if (Character.isUpperCase(cType)) {
                System.out.print(Character.toLowerCase(cType));
            } else {
                System.out.print(Character.toUpperCase(cType));
            }
        }
    
    }
}