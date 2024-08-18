import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int i2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 1 + i; j < numbers.length; j++){
                int temp = numbers[i] + numbers[j];
                if(list.indexOf(temp) < 0){
                    list.add(temp);
                }
            }
        }
        
        answer = new int[list.size()];

        for(int num : list){
            answer[i2++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}