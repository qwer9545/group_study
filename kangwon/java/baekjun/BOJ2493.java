import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

/*
https://www.acmicpc.net/problem/2493
KOI 통신연구소는 레이저를 이용한 새로운 비밀 통신 시스템 개발을 위한 실험을 하고 있다.
실험을 위하여 일직선 위에 N개의 높이가 서로 다른 탑을 수평 직선의 왼쪽부터 오른쪽 방향으로 차례로 세우고,
각 탑의 꼭대기에 레이저 송신기를 설치하였다. 모든 탑의 레이저 송신기는 레이저 신호를 지표면과 평행하게
수평 직선의 왼쪽 방향으로 발사하고, 탑의 기둥 모두에는 레이저 신호를 수신하는 장치가 설치되어 있다.
하나의 탑에서 발사된 레이저 신호는 가장 먼저 만나는 단 하나의 탑에서만 수신이 가능하다.

예를 들어 높이가 6, 9, 5, 7, 4인 다섯 개의 탑이 수평 직선에 일렬로 서 있고,
모든 탑에서는 주어진 탑 순서의 반대 방향(왼쪽 방향)으로 동시에 레이저 신호를 발사한다고 하자.
그러면, 높이가 4인 다섯 번째 탑에서 발사한 레이저 신호는 높이가 7인 네 번째 탑이 수신을 하고,
높이가 7인 네 번째 탑의 신호는 높이가 9인 두 번째 탑이, 높이가 5인 세 번째 탑의 신호도 높이가 9인 두 번째 탑이 수신을 한다.
높이가 9인 두 번째 탑과 높이가 6인 첫 번째 탑이 보낸 레이저 신호는 어떤 탑에서도 수신을 하지 못한다.

탑들의 개수 N과 탑들의 높이가 주어질 때, 각각의 탑에서 발사한 레이저 신호를 어느 탑에서 수신하는지를 알아내는 프로그램을 작성하라.
????
 */
// 파이썬으로 풀이한 코드보고 풀어라도 보자
// https://ddggblog.tistory.com/238
public class BOJ2493 {
    public static void main(String[] args) {
        //???
        //탑의 높이 리스트를 역순으로 읽으며 아래의 과정 반복
        //1. 다음 탑이 스택의 TOP 보다 높거나 같다면 , POP하고 그 탑의 레이저가 송신한 탑 (다음 탑)을 기록한다.
        //2. 만약 스택의 TOP 보다 작다면 , 스택의 맨 위에 그 탑을 추가하고 while 문을 break 한다.
        //1번 과정은 stack이 빌 때 까지 진행한다.


        //Q. java util 등 라이브러리도 직접 다 손으로 쳐야하는지?
       int N = 5;
//       int[] height = new int[N];
//       height = new int[]{6,9,5,7,4};
       int[] height = new int[]{6,9,5,7,4};
       Stack<Integer> stack = new Stack<>();
       stack.size();

       for(int i = N; i< 1;i--){
           //값 비교하는 조건걸고 조건에 맞으면 값 추가 아니면 초기값 0?
           // 근데 그 값이 있는 index를 찾아가야 해
           // 뭔가 반대로 꺾고 부딪히는 애가 있어야 할듯함 역순으로 -> stack이라 자동?
           // 아니면 값 대소 비교해서 바로 결과를 낸다?
           if(height[i] >= height[i+1]){
               stack.push(height[i]);
               System.out.println("stack = " + stack);
           }
       }
    }
}
