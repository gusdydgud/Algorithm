import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack=new Stack<>();
        int cnt=0;
        for(char num:number.toCharArray()){
            while(!stack.isEmpty()&&cnt<k&&stack.peek()<num){
                stack.pop();
                cnt++;
            }
            stack.push(num);
        }
        for(int i=0;i<number.length()-k;i++){
            answer+=stack.get(i);
        }
        return answer;
    }
}