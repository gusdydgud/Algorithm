class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int c = chicken;
        while(c>=10){
            int sc = c/10;
            answer += sc;
            c= sc+(c%10);
        }
        return answer;
    }
}