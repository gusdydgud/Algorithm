class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=1;
        while(true){
            if(n%cnt==0&&cnt%2>0){
                answer++;
                
            }
            cnt++;
            if(cnt>n) break;
        }
        return answer;
    }
}