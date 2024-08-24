class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] stli = new String[my_string.length()];
        for(int i =0; i<my_string.length();i++){
            stli[i] = my_string.substring(i);
            if(is_suffix.equals(stli[i])) {
                return 1;
            }
        }
            // if(my_string.endsWith(is_suffix)){
            //     return 1;
            // }
            // else
            //     return 0;
        return 0;
    }
}