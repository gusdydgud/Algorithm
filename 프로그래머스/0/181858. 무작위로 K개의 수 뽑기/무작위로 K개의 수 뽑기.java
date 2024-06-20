import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        boolean ck[]= new boolean[100001];
        int i=0;
        for(int j=0;j<arr.length&&i<k;j++){
            if(!ck[arr[j]]){
                ck[arr[j]]=true;
                answer[i++]=arr[j];
                
            }
        }
        while(i<k){
            answer[i++]=-1;
        }
        
        return answer;
    }
}