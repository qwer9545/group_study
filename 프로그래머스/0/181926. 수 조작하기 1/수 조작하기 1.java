class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String str = "";
        
        for(int i =0; i<control.length(); i++){
            // String str = control[i];
            switch(control.substring(i, i+1)){
            case "w": 
                n+=1;
                break;
            case "s":
                n-=1;
                break;
            case "d":
                n+=10;
                break;
            default:
                n-=10;
                break;
            }
        }                     
        return n;
    }
}