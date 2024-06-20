import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String arr[] = my_string.split("");
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            while(s<e){
                String t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        String answer ="";
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        return answer;
    }
}