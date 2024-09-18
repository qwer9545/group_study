//https://school.programmers.co.kr/learn/courses/30/lessons/133499
//StringTokenizer를 사용할 수 없는 이유: 구분자로 나눌 필요가 없음
//compareTo는 포함 여부만 확인하고 정확히 일치하는지 확인할 수 없기에 equals()
// 단어를 분리하는게 아닌, 연속적인 발음 검증이 핵심이기 때문에, 

// 적용 가능한 방법
//1. 현재 처리중인 위치를 인덱스로 관리하며 순차적으로 이동
//2. 발음 가능한 문자열을 제거하면서 끝까지 탐색
// babbling 배열의 단어 반복으로 발음할 수 있는 문자열 검증 이후 startsWith
// 발음한 문자열 substring

import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(String babble : babbling){
            int idx = 0;
            String previousWord = "";
            boolean isValid = true;
            
            while(idx < babble.length()){
                boolean found = false;
                
                for(String word : words){
                    if(babble.startsWith(word, idx)) {
                        if(word.equals(previousWord)) {
                            isValid = false;
                            break;
                        }
                    
                        previousWord = word;
                        idx += word.length();
                        found = true;
                        break;
                    }
                }
                if(!found){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid && idx == babble.length()) {    
            answer++;
            }
        }
        return answer;
    }
}