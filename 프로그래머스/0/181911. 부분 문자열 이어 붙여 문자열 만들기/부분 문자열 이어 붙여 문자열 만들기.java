class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int s, e;
        //my_strings[i] 0~4
        //parts[s,e]
        for(int i=0; i< my_strings.length;i++) {
            String ans1 = my_strings[i].substring(parts[i][0],parts[i][1]+1);
            
            System.out.println(ans1);
            answer += ans1;
        }
        return answer;
    }
}