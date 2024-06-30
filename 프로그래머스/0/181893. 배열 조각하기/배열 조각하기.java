class Solution {
    public int[] solution(int[] arr, int[] query) {
        int s= 0;
        int e= arr.length -1;
        for(int i=0;i<query.length;i++){
            int j= query[i];
            if(i%2==0){
                e = s+j;
                
            }else{
                s= s+j;
            }
        }
        
        int[] answer = new int[e-s+1];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[s+i];
        }
        return answer;
    }
}