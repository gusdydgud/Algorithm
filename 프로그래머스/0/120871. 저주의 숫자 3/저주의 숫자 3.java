class Solution {
    public int solution(int n) {
        int answer = 0;
        int c = 0;
        
        while (c < n) {
            answer++;
            if (answer % 3 == 0) {
                continue;
            }
            int t = answer;
            boolean ck = false;
            while (t > 0) {
                if (t % 10 == 3) {
                    ck = true;
                    break;
                }
                t /= 10;
            }
            
            if (ck) {
                continue;
            }
            
            c++;
        }
        
        return answer;
    }
}