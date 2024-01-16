import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();

    public static void dfs(int start){
        check[start] = true;
        sb.append(start + " ");

        for(int i=0; i<=node; i++){
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }

    public static void bfs(int start){
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start + " ");

            for(int i=0; i<=node; i++){
                if(arr[start][i] == 1 && !check[i]){
                    q.add(i);
                    check[i]=true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st1.nextToken());
        line = Integer.parseInt(st1.nextToken());
        start = Integer.parseInt(st1.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];
        for(int i = 0; i < line; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");
        check = new boolean[node+1];

        bfs(start);

        System.out.println(sb);
    }
}
