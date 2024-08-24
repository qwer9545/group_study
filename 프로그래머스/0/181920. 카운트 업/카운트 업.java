class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = end_num - start_num;
        int[] answer = new int[size+1];
        
        for(int i=0; i<answer.length; i++){
           answer[i] += start_num+i;     
        }
        
        return answer;
    }
}