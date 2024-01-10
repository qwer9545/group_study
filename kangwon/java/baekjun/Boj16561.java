/* 강사님 코드
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력
        System.out.println(N);
        // for (int i = 3; i <= N - 3 - 3; i+=3) {
        int jMin = 3;
        int kMin = 3;
        // for (int i = 3; i <= N - 6; i+=3) {
        int count = 0;
        for (int i = 3; i <= N - jMin - kMin; i+=3) {
            // for i in range(3, N - 3, 3):
            // N이 6이면 이 for문은 작동할까요? i <= 0
            // for (int j = 3; j <= N - i - kMin)
            for (int j = 3; j <= N - i - 3; j+=3) {
                // i 와 j가 결정이 되면 자연스럽게 k가 결정이 되는데...
                // 이 내부에 중첩 for문이 돈다 -> i, j가 3의 배수이며
                // i, j, k를 합쳤을 때 N이 된다
                count++; // count+=1;
            }
        }
        System.out.println(count);
    }
}
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
public class Boj16561 {
    public static void main(String[] args){
        int count = 0;

        for(int i = 3; i<=n-6; i+=3){
            for(int j = 3; j <= n-i-3; j+=3){
                count++;
            }
        }
        System.out.println("count = " + count);
//        int n = Integer.parseInt(br.readLine());	// BufferedReader를 통해 정수 n입력 받기
    }
}

 */