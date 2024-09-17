//https://school.programmers.co.kr/learn/courses/30/lessons/42627
import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 요청 시간 기준으로 정렬
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        
        int currentTime = 0;  // 현재 시간
        int jobIndex = 0;     // 처리할 작업 인덱스
        int totalWaitTime = 0; // 총 대기 시간
        int completedJobs = 0;    // 완료된 작업 수
        
        while (completedJobs < jobs.length) {
            // 현재 시점에서 처리할 수 있는 모든 작업을 큐에 추가 SJF
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= currentTime) {
                pq.add(jobs[jobIndex]);
                jobIndex++;
            }
            
            // 처리할 수 있는 작업이 없다면 시간을 앞으로 이동
            if (!pq.isEmpty()) {
                int[] job = pq.poll();  // 큐에서 가장 짧은 작업 꺼내기
                currentTime += job[1];  // 현재 시간 업데이트 (작업 소요 시간 더함)
                totalWaitTime += (currentTime - job[0]);  // 대기 시간 = (종료 시간 - 요청 시간)
                completedJobs++;  // 완료된 작업 수 증가
            } else {
                
                // 처리할 수 있는 작업이 없으면 시간을 다음 작업의 요청 시간으로 이동
                currentTime = jobs[jobIndex][0];
            }
        }

        return totalWaitTime / jobs.length;  // 평균 대기 시간 반환 (소수점 이하 버림)
    }
}


// import java.util.PriorityQueue;
// import java.util.Arrays;

// class Solution {
//     public int solution(int[][] jobs) {
//         int answer = 0;
        
//         Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
//         int currentTime = 0;
//         int completedJobs = 0;
//         int totalWaitTime = 0;
        
//         for(int i =0; i<jobs.length;i++){
//             if(pq[i][0] <= currentTime) {
//                 currentTime += pq[i][1];
//                 totalWaitTime += (currentTime - pq[i][0]);
//                 completedJobs++;
//             } else {
//                 currentTime = pq[i][0] + pq[i][1];
//                 totalWaitTime += pq[i][1];
//                 completedJobs++;
//             }
//         }
//         return totalWaitTime / completedJobs;
//     }
// }

        
        // while (completedJobs < jobs.length){
        //     while (jobIndex < jobs.length && jobs[jobIndex][0] <= currentTime) {
        //         pq.add(jobs[jobIndex]);
        //         jobIndex++;
        //     }
        
//         while(!pq.isEmpty()) {
//             int[] current = pq.poll();
            
//             int[] firstJob = pq.poll();
            
            // int jobtime = current + firstJob;

//             System.out.println(Arrays.toString(current));
//             System.out.println(Arrays.toString(firstJob));