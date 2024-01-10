/*
https://www.acmicpc.net/problem/12930
N개의 정점으로 이루어진 그래프 G가 있다. 그래프의 정점은 0번부터 N-1번까지 번호가 매겨져 있다.
그래프 G의 모든 간선은 가중치를 2개 가지고 있고, 각각을 가중치 1, 가중치 2라고 한다.
0번 정점에서 1번 정점으로 가는 최단 경로를 찾는 프로그램을 작성하시오.
경로의 비용은 경로에 있는 간선의 가중치 1을 모두 더한 값인 W1과 가중치 2를 모두 더한 값인 W2를 곱해서 구할 수 있다.
 */

import java.util.ArrayList;
//
public class BOJ12930 {}
//
////    public static void main(String[] args) {
//        int N = 4;
//        int [][] weight1 = new int[N/2][N/2];
//        int [][] weight2 = new int[N/2][N/2];
//
//        int answer = weight1[][] * weight2[][];
//        //ArrayList cnt에 간선 개수 세어주기
//        int cnt[] = new ArrayList[N]; //tlvkfRj
        /*
        for(int i = 0; i < e*2; i++)
        cnt[e[i][0]] += 1;

        ?

        for(int i = 1; i <= v; i++)
        cnt[i] = cnt[i-1] + cnt[i];

         */

        /*
        1) 가중치의 값이 w >=0 이라면, 간선이 없는 곳은 0대신 -1을 넣어 구별해줄 수 있다.
        2) 가중치의 값이 모든 범위의 정수라면, 인정행렬 2개를 만들어 해결해야하는데,
            인접하면 1 아니면 0을 저장한 행렬 1개, 인접한 곳의 가중치를 저장한 행렬 1개
            즉, 총 2개의 인접행렬을 만들어 해결할 수 있다.

            /*가중치가 있을 때, 방향이 없는 그래프 (양방향 그래프)인 경우
        # include <iostream>
        using namespace std;

        int a[10][10];
        int main()
        {
            int n, m;
            cin >> n >> m;
            for (int i = 0; i < m; i++){
                int u, v, w;
                cin >> u >> v >> w;
                a[u][v] = a[v][u] = w;        // 그래프가 방향이 있을 때와 없을 때의 차이는 여기만.
            }
        }
         */
        /*가중치가 있을 때, 방향 그래프인 경우
        # include <iostream>
        using namespace std;

        int a[10][10];
        int main()
        {
            int n, m;
            cin >> n >> m;
            for (int i = 0; i < m; i++){
                int u, v, w;
                cin >> u >> v >> w;
                a[u][v] = w;              // 그래프가 방향이 있을 때와 없을 때의 차이는 여기만.
            }
        }
        */
        //N개 기준
        // 가중치를 모두 더한 값/2 => @@@그래프 예제1, 예제2
        // 가중치 * 가중치 => @@@그래프 예제4
        // N이 2면 출력: -1 => 예외값
        
/*
        if()
        //weight[i][j]
        for(int[][] weihgh1 : )
            for(int i = 0; i< N; i++){
                for(int j = 0; j<N; i++){
                    weight1[i][j] = weight1[j][i];
                    weight2[i][j] = weight2[j][i];

                    if('.'){
                        count
                    }
//                    weight1[i][i] = '.';
//                    weight2[i][i] = '.';
//                    weight1[i][j] == '.' && weight2[i][j] == '.';
//                    weight2[i][j] == '.' && weight1[i][j] == '.';
                }
            }



    }
}

 */
