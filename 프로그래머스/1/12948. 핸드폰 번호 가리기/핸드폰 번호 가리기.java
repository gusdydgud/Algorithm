import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i = phone_number.length();
        for(int j =0;j<i;j++){
            
            
            if(i-j<=4){
                answer+=phone_number.charAt(j);
            }else{
                answer+="*";
            }
        }
        
        return answer;
    }
}