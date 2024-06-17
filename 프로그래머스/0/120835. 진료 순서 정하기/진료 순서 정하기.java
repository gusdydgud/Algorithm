import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=emergency[i];
        }
        Arrays.sort(answer);
        int arr[]=new int[answer.length];
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer.length;j++){
                if(answer[i]==emergency[j]){
                    arr[i]=answer.length-j;
                    break;
                }
            }
        }
        
        return arr;
    }
}