class Solution {
    public int solution(int n) {
        int answer = 0;
        int f=1;
        while(f<=n){
            answer++;
            f*=answer;
        }
        
           
        return answer-1;
    }
}