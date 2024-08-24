import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer ="";
        char b;
        for(int i=0; i<a.length();i++){
            b = a.charAt(i);
            //대 to 소
            if(Character.isUpperCase(b))
            {
                answer+= Character.toLowerCase(b);
            }
            //소 to 대
            else{
                answer+= Character.toUpperCase(b);
            }    
        }
        System.out.println(answer);
    }
}