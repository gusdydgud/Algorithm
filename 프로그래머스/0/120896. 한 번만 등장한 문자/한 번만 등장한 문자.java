import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int arr[] = new int[26];
        for(char c :s.toCharArray()){
            arr[c-'a']++;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                answer+=(char) (i+'a');
            }
        }
        char arr1[] = answer.toCharArray();
        Arrays.sort(arr1);
        
        
        return new String(arr1);
    }
}