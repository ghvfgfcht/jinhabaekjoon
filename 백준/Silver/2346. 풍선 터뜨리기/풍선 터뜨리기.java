import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int index, value;
        Node next, prev;
        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Node> list = new ArrayList<>();
        Node[] nodes = new Node[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i + 1, Integer.parseInt(st.nextToken()));
            list.add(nodes[i]);
        }

        for (int i = 0; i < N; i++) {
            nodes[i].next = nodes[(i + 1) % N];
            nodes[i].prev = nodes[(i - 1 + N) % N];
        }

        Node node = nodes[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(node.index).append(' ');
            node.prev.next = node.next;
            node.next.prev = node.prev;
            int move = node.value;
            for (int j = 0; j < Math.abs(move); j++) {
                if (move > 0) {
                    node = node.next;
                } else {
                    node = node.prev;
                }
            }
        }

        System.out.println(sb);
    }
}