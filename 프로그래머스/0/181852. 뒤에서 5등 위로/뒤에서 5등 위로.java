import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        Arrays.sort(num_list);
        
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}

        
        
        
        
//         int[] answer = new int[5];
//         int temp = 0;
        
//         for(int i =0; i< num_list.length-1; i++) {
//             for(int j=0; j< num_list.length -i -1; j++) {
//                 if(num_list[j] > num_list[j+1]){
//                 temp = num_list[j+1];
//                 num_list[j+1] = num_list[j];
//                 num_list[j] = temp;
//                 } 
//             }
//         }
        
//         answer = Arrays.copyOfRange(num_list, num_list.length - 5 ,num_list.length);
//         return answer;
//     }
// }