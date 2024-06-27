import java.util.*;

public class Solution {

    public int solution(String A, String B) {

        if(A.equals(B)) return 0;
        int answer = 0;

        char[] arr = A.toCharArray();
        char[] newarr = new char[arr.length];

        for(int i = 1; i < A.length(); i++) {
            answer++;

            newarr[0] = arr[arr.length - 1];
            for(int j = 1; j < newarr.length; j++) {
                newarr[j] = arr[j - 1];
            }

            arr = Arrays.copyOf(newarr, arr.length);

            if(new String(arr).equals(B)) {
                return answer;
            }

        }      
        return -1;    
    }
}