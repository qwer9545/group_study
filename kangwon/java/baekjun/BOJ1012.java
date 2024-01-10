/*
https://www.acmicpc.net/problem/1012
차세대 영농인 한나는 강원도 고랭지에서 유기농 배추를 재배하기로 하였다.
농약을 쓰지 않고 배추를 재배하려면 배추를 해충으로부터 보호하는 것이 중요하기 때문에,
한나는 해충 방지에 효과적인 배추흰지렁이를 구입하기로 결심한다. 이 지렁이는 배추근처에 서식하며 해충을 잡아 먹음으로써 배추를 보호한다.
특히, 어떤 배추에 배추흰지렁이가 한 마리라도 살고 있으면 이 지렁이는 인접한 다른 배추로 이동할 수 있어,
그 배추들 역시 해충으로부터 보호받을 수 있다.
한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우에 서로 인접해있는 것이다.

한나가 배추를 재배하는 땅은 고르지 못해서 배추를 군데군데 심어 놓았다.
배추들이 모여있는 곳에는 배추흰지렁이가 한 마리만 있으면 되므로
서로 인접해있는 배추들이 몇 군데에 퍼져있는지 조사하면 총 몇 마리의 지렁이가 필요한지 알 수 있다.
예를 들어 배추밭이 아래와 같이 구성되어 있으면 최소 5마리의 배추흰지렁이가 필요하다.
0은 배추가 심어져 있지 않은 땅이고, 1은 배추가 심어져 있는 땅을 나타낸다.

1	1	0	0	0	0	0	0	0	0
0	1	0	0	0	0	0	0	0	0
0	0	0	0	1	0	0	0	0	0
0	0	0	0	1	0	0	0	0	0
0	0	1	1	0	0	0	1	1	1
0	0	0	0	1	0	0	1	1	1

 */
//지뢰찾기?
// https://school.programmers.co.kr/learn/courses/30/lessons/250125

public class BOJ1012 {
    public static void main(String[] args) {
        int T = 2;
        int[] M = new int[10];
        int[] N = new int[8];
        int[] x = {0, 1, -1, 0};
        int[] y = {1, 0, 0, -1};
        int K = 17;
        int bug = 0;
        String[][] bugarea;

        for (int i = 0; i < M.length; i++) {
            int M_check = x + M[i];
            int N_check = y + N[i];
            if (M_check >= 0 && M_check < K && N_check >= 0 && N_check < K) {
                if (bugarea[M][N].equals(bugarea[M_check][N_check])) {
                    bug++;
                    //? 생각 안하면서 하고있었어요..
                }
            }
        }
        System.out.println("bug = " + bug);
    }
}
