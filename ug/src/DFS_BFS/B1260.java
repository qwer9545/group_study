package DFS_BFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// q) 정점번호가 작은순 방문 -> for 문  i= 0 부터 시작

public class B1260 {
    static int n, m, v;
    static int[][] map; // 정점 지도
    static boolean check[]; // 방문 여부
    static Queue<Integer> q = new LinkedList<>(); // BFS 이용
    static StringBuilder sb = new StringBuilder();


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

//        System.out.println("n: " + n + "m: " + m + "v: " + v);

        map = new int[n + 1][n + 1];
        check = new boolean[n + 1];

        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());
            map[fir][sec] = map[sec][fir] = 1;
        }

        DFS(v);
        sb.append("\n");
        check = new boolean[n + 1];

        BFS(v);
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }

    public static void DFS(int v) {
        check[v] = true;
        sb.append(v + " ");
        for (int i = 0; i <= n; i++) {
            if (map[v][i] == 1 && !check[i])
                DFS(i);
        }
    }

    public static void BFS(int v) {
        q.add(v);
        check[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            sb.append(v + " ");
            for (int i = 0; i <= n; i++) {
                if (map[v][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
