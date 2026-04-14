import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] answer = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            answer[i][0] = Integer.parseInt(st.nextToken());
            answer[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(answer, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        for (int i = 0; i < n; i++) {
            sb.append(answer[i][0]).append(" ").append(answer[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
