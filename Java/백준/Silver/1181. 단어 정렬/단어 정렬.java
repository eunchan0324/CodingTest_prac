import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            strSet.add(br.readLine());
        }

        String[] strArr = strSet.toArray(new String[0]);

        Arrays.sort(strArr, ((s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }

            return s1.compareTo(s2);
        }));

        for (String s : strArr) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}
