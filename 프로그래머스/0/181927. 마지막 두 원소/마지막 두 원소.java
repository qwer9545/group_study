class Solution {
    public int[] solution(int[] num_list) {

        int f1 = num_list[num_list.length-1];
        int f2 = num_list[num_list.length-2];
        int f3;
        
        if(f1 > f2)
        {
            f3 = f1 -f2;
        }
        else{
            f3 = f1 * 2;
        }
        
        int[] answer = new int[num_list.length + 1];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];    
        }
        answer[answer.length - 1] = f3;
        
        return answer;
    }
}