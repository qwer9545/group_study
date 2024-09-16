//https://school.programmers.co.kr/learn/courses/30/lessons/42626

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville){
            pq.add(s);
        }
        
        //스코빌 지수를 K이상이 될 때까지 반복 탐색
        while(pq.size() > 1) { 

            // 가장 작은 값이 K 이상이면 종료
            if(pq.peek() >= K) {
                return answer;
            }
               
            int firstPoll = pq.poll();
            int secondPoll = pq.poll();
            int newScoville = firstPoll + (secondPoll * 2);

            pq.add(newScoville);
            answer++;
        }
        if(pq.peek() < K) {
            return -1;
        }
        
        return answer;
    }
}