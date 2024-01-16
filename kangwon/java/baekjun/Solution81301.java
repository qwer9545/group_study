/*
네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면
프로도는 원래 숫자를 찾는 게임입니다.


다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

숫자	영단어
0	zero
1	one
2	two
3	three
4	four
5	five
6	six
7	seven
8	eight
9	nine
제한사항
1 ≤ s의 길이 ≤ 50
s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
입출력 예
s	result
"one4seveneight"	1478
"23four5six7"	234567
"2three45sixseven"	234567
"123"	123
 */

package algo;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution81301 {
//    public static void main(String[] args) {

        public int solution (String s){
            int answer = 0;
            String[] s2 = {"one4seveneight", "23four5six7", "1zerotwozero3"};
            String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for(int i=0; i<arr.length;i++){
                if(s2.contains(arr[i])) {
                    s= s2.replace(arr[i], String.valueOf(i));
                }
            }
            return Integer.parseInt(s);
//        String s = "one4seveneight";
//        StringBuffer[] s = {"one4seveneight};
            // 알파벳 2개씩 스플릿? case나 if?, 숫자뒤에 붙인다 .append? +?
//        for(int i = 0; i < s.size(); i++){
//            if(s.get(i) == "o" && s.get(i+1) == "n")


//        String s2 = s.replaceAll("one", "1");
//        String s3 = s2.replaceAll("seven", "7");
//        String s4 = s3.replaceAll("eight", "8");
//        System.out.println("s4 = " + s4); //1478
//        Integer.parseInt(s4);

            //값 검색: contains
            //값 위치찾기: indexOf
        }


    }
