class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";     

        String str1 = my_string.substring(0,s);
        String str2 = my_string.substring(s+overwrite_string.length());
        
        System.out.println(str1);
        System.out.println(str2);
        
        answer=str1+overwrite_string+str2;    
        return answer;
    }
}