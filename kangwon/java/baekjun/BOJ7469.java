/*
https://www.acmicpc.net/problem/7469
현정이는 자료 구조 프로젝트를 하고 있다. 다른 학생들은 프로젝트 주제로 스택, 큐와 같은 기본 자료 구조를 구현하는 주제를 선택했다.
하지만, 현정이는 새로운 자료 구조를 만들었다.현정이가 만든 자료구조는 배열을 응용하는 것이다.
배열 a[1...n]에는 서로 다른 수가 n개 저장되어 있다.
현정이는 여기에 Q(i,j,k)라는 함수를 구현해 모두를 놀라게 할 것이다.

Q(i,j,k): 배열 a[i...j]를 정렬했을 때, k번째 수를 리턴하는 함수
예를 들어, a = (1,5,2,6,3,7,4)인 경우 Q(2,5,3)의 답을 구하는 과정을 살펴보자.
a[2...5]는 (5,2,6,3)이고, 이 배열을 정렬하면 (2,3,5,6)이 된다.
정렬한 배열에서 3번째 수는 5이다. 따라서 Q(2,5,3)의 리턴값은 5이다.

배열 a가 주어지고, Q함수를 호출한 횟수가 주어졌을 때, 각 함수의 리턴값을 출력하는 프로그램을 작성하시오.
 */
/*
import java.lang.reflect.Array;
import java.util.Arrays;

// https://loosie.tistory.com/682
public class BOJ7469 {
    public static void main(String[] args) {
    //Bufferreader 사용법부터 익히자

        int n = 7;
        int m = 3;
        int[] array = new int[n];
        int temp;

        array.append("3번째줄 값들");


        //숫자 정렬 자체 함수 sort? 배열 내 적용 가능?
        //머지 소트 트리는 먼데

        //Q함수를 m만큼 반복
        for(int k = 0; k<m; k++){
            //값 비교 후 정렬?
            int i, j, q;
            int Arraysub[] = Array.substr(i, q);
            for(int z = 0; z<Arraysub.length;z++) {
                if (array[z] > array[k]) {
                    temp = array[z];
                    array[k] = temp;
                }

//            sort

                //위치에 있는 값 출력?
            }
                return Arraysub[q];
        }

    }

}


*/