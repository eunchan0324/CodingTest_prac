import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                q.offer(Integer.parseInt(st.nextToken()));
            } else if (cmd.equals("pop")) {
                sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (cmd.equals("empty")) {
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            } else if (cmd.equals("front")) {
                sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
            } else {
                sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
